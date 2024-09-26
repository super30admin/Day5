"""
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character 
while preserving the order of characters. No two characters may map to the same 
character, but a character may map to itself.

Constraints:
1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
"""

# Time Complexity : O(1)
# Space Complexity : O(n) (2 * O(n))
# Did this code successfully run on leetCode : Yes
# Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        # Creating 2 discionaries as hashmaps.
        map1 = {}
        map2 = {}
        
        # if lengths of strings are not equal, they cannot be isomorphic 
        if len(s) != len(t):
            return False

        # Comparing characters
        for i in range(len(s)):

            # if strings not matching to the map, clearly not isomorphic
            if(s[i] not in map2 and t[i] in map1) or (t[i] not in map2 and s[i] in map1):
                return False
            
            # if string s character is not mapped in the hashmap, map it. Same goes for string t
            elif s[i] not in map1:
                map1[s[i]] = t[i]
                map2[t[i]] = s[i]

            # if mapping in each string is different, clearly not isomorphic. Hence, return false
            elif map1[s[i]] != t[i] or map2[t[i]] != s[i]:
                return False
        
        # isomorphic
        return True


s = Solution()
result = s.isIsomorphic("egg", "add")
print(result)