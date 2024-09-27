# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_arr = s.split(' ')
        p_map = {}
        s_map = {}
        if len(pattern)!=len(s_arr):
            return False
        for i in range(len(pattern)):
            p_char = pattern[i]
            if p_char not in p_map.keys():
                p_map[p_char] = s_arr[i]
            else:
                if p_map[p_char]!=s_arr[i]:
                    return False
            
            if s_arr[i] not in s_map.keys():
                s_map[s_arr[i]] = pattern[i]
            else:
                if s_map[s_arr[i]]!=pattern[i]:
                    return False
        return True
