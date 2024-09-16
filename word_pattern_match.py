# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        ptos_map = {}
        stop_map = {}
        
        arr = s.split(" ")
        if len(arr) != len(pattern): return False
        
        for i in range(len(pattern)):
            char = pattern[i]
            s = arr[i]
            
            if char not in ptos_map:
                ptos_map[char] = s
            else:
                if ptos_map[char] != s:
                    return False
                
            if s not in stop_map:
                stop_map[s] = char
            else:
                if stop_map[s] != char:
                    return False
                
        return True
        