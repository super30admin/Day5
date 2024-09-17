"""

https://leetcode.com/problems/isomorphic-strings/
Approach: Use 2 hashMaps or 1 HashMap and 1 HashSet such that:
2 Hashmaps:
for every letter s[i] in string s - add it to hashMap and corresponding letter t[i]
and add t[i] to tMap with its correspnding letter s[i]
if the letter is already in the hashmap - check if value for map[s[i]] == t[i] if not return False
also if map[t[i]] != s[i] then return False

TC O(n) Linear time as we only loop over string one time 
SC O(2n) as we have 2 hashmaps and possibly we may store all chars in both of them so drop constant = O(n)

1HashMap and HashSet:
for every letter s[i] in string s - add it to hashMap and corresponding letter t[i]
and add t[i] to hashSet

TC O(n) Linear time as we only loop over string one time 
SC O(2n) as we have 1 HashMap and 1 HashSet and possibly we may store all chars in both of them so drop constant = O(n)

"""

# Approach 1: 
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # base case
        if len(s) != len(t) : return False
        
        # take two maps to do mapping of string characters to one another
        sd, td = {}, {}
        # we can loop over range for any one of the strings as both strings are same len
        for i in range(len(s)):
            if s[i] not in sd:
                sd[s[i]] = t[i]
            else:
                if sd[s[i]] != t[i]:
                    return False
            if t[i] not in td:
                td[t[i]] = s[i]
            else:
                if td[t[i]] != s[i]:
                    return False
        return True
            

# Approach 2:
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # base case
        if len(s) != len(t) : return False
        
        # take two maps to do mapping of string characters to one another
        sd, td = {}, set()
        # we can loop over range for any one of the strings as both strings are same len
        for i in range(len(s)):
            if s[i] not in sd:
                sd[s[i]] = t[i]
                if t[i] not in td:
                    td.add(t[i])
                else:
                    return False
            else:
                if sd[s[i]] != t[i]:
                    return False
        return True
            



