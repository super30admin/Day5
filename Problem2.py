# ## Problem 2:
# Given two strings s and t, determine if they are isomorphic.
# Two strings are isomorphic if the characters in s can be replaced to get t.
# All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

# Example 1:
# Input: s = "egg", t = "add"
# Output: true

# Example 2:
# Input: s = "foo", t = "bar"
# Output: false

# Example 3:
# Input: s = "paper", t = "title"
# Output: true
# Note:
# You may assume both s and t have the same length.

# Solution 1 - Taking 2 hashmaps -> tmap and smap
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        smap,tmap={},{}
        for i in range(0,len(s)):
            schar = s[i]
            tchar = t[i]
            if schar in smap:
                if smap[schar] != tchar:
                    return False
            else:
                smap[schar] = tchar
            if tchar in tmap:
                if tmap[tchar] != schar:
                    return False
            else:
                tmap[tchar] = schar
        return True
    
# Time Complexity - o(n) 
# space Complexity - o(1) as max space required would be for 256 characters 

# Solution 2 - Taking 1 hashmap (smap) and 1 set (tset)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        smap,tset={},set()
        for i in range(0,len(s)):
            schar = s[i]
            tchar = t[i]
            if schar in smap:
                if smap[schar] != tchar:
                    return False
            else:
                if tchar in tset:
                    return False
                else:
                    smap[schar] = tchar
                    tset.add(tchar)
        return True

# Time Complexity - o(n) 
# space Complexity - o(1) as max space required would be for 256 characters 