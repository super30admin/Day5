# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : I don't understand how the space complexity is O(1) here.
# it involved auxiliary space. But I don't get that, help me with this please.


# Your code here along with comments explaining your approach in three sentences only
# check if the lengths of the hashmaps are equal or not, if they are not then return false
# in 2 hashmaps we map s[i] to t[i] and vice versa to check if they are uniquely mapped or not.
# if they are not then return false.


# solution 1: using 2 hashmaps

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return  False
        hm = {}
        hm1 = {}

        for i in range(len(s)):
            if (s[i] in hm and hm[s[i]] != t[i]) or (t[i] in hm1 and hm1[t[i]] != s[i]):
                return False
            hm[s[i]] = t[i]
            hm1[t[i]] = s[i]
        return True
    

# solution 2 with char lists
    
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        schar = [''] * 256
        tchar = [''] * 256

        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            sindex = ord(s[i]) 
            tindex = ord(t[i]) 
            if (schar[sindex] != '' and schar[sindex] != t[i]) or (tchar[tindex] != '' and tchar[tindex] != s[i]):
                return False
            schar[sindex] = t[i]
            tchar[tindex] = s[i]
        
        return True
    
# solution 3: using hashmap and hashset

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap = {}
        tset = set()

        for i in range(len(s)):
            if (s[i] in smap and smap[s[i]] != t[i]) or (s[i] not in smap and t[i] in tset ):
                return False
            smap[s[i]] = t[i]
            tset.add(t[i])
        return True 
    

