# Time Complexity : O(N)
# Space Complexity : O(1) # since space is limited to 26 characters

# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO

# Your code here along with comments explaining your approach

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        char_map_s = {} # maps from s -> t
        char_map_t = {} # maps from t -> s

        for i in range(len(s)):
            if s[i] not in char_map_s and t[i] not in char_map_t:
                char_map_s[s[i]] = t[i]
                char_map_t[t[i]] = s[i]

            if s[i] in char_map_s:
                if char_map_s[s[i]] != t[i]:
                    return False
            
            if t[i] in char_map_t:
                if char_map_t[t[i]] != s[i]:
                    return False

        return True