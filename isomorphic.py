# Time Complexity : 0(n)
# Space Complexity : 0(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        S_array = [-1] * 256 # Stores index of characters in string s
        T_array = [-1] * 256 # Stores index of characters in string t
        
        length = len(s) # Get the length of both strings
        
        if length != len(t): 
            return False
        
        for i in range(length): 
            char_s = ord(s[i])
            char_t = ord(t[i])

            if S_array[char_s] != T_array[char_t]:
                return False
            
           
            S_array[char_s] = i
            T_array[char_t] = i

        return True


