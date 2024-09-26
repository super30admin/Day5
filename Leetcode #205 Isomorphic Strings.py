# Time Complexity: O(n) 
# Space Complexity: O(1)

class Solution:
    def isIsomorphic(s, t):
        s_dictionary = {}
        t_dictionary = {}

        for i in range(len(s)):
            if s[i] not in s_dictionary:
                s_dictionary[s[i]] = t[i]
            else:
                if s_dictionary[s[i]] != t[i]:
                    return False
            
            if t[i] not in t_dictionary:
                t_dictionary[t[i]] = s[i]
            else:
                if t_dictionary[t[i]] != s[i]:
                    return False
        
        return True