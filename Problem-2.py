// Checked the values if there is existing value similar to it than dont have to add else have to map that value to the key.
// T.C = O(n)

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        hashMap1 = {}
        hashSet = set()

        for i in range(len(s)):
            sMap = s[i]
            tMap = t[i]
            if sMap in hashMap1:
                if(hashMap1[sMap] != tMap):
                    return False
            else:
                if tMap in hashSet:
                    return False
                hashMap1[sMap] = tMap
                hashSet.add(tMap)
                
    
        return True
        