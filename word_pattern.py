
# Time Complexity : O(n) n = n is length of s
# Space Complexity: O(1) since there can at most be 26 keys.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        x = s.split(" ")
        p_str = {}
        s_str = {}
        
        if len(x)!=len(pattern):
            return False
        
        for i in range(len(x)):
            
            if x[i] not in s_str:
                s_str[x[i]] = pattern[i]
                
            else:
                if s_str[x[i]]!=pattern[i]:
                    return False
                
            if pattern[i] not in p_str:
                p_str[pattern[i]] = x[i]
                
            else:
                if p_str[pattern[i]] != x[i]:
                    return False
        
        return True
                    
                 
        