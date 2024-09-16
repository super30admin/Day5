#Time-Complexity: O(n*n)
#Space-Complexity: O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        s=s.split()    
        if len(pattern)!=len(s):
            return False
        
        hashmap = {}
        
        for i in range(len(pattern)):
            if pattern[i] not in hashmap.keys():
                if s[i] in hashmap.values():
                    return False
                hashmap[pattern[i]] = s[i]
            elif hashmap[pattern[i]] != s[i]:
                return False
                    
                    
        return True