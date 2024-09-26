#Time Complexity: O(n)

#Space Complexity: O(1)

#Approach: Use a hashMap and a hashSet, if elementS exists in hashMap, mapping must be same as elementT, else return False as elementS has already been mapped to some # other char
# If elementS doesn't exist in hashMap, elementT must not exist in set -> as otherwise it has already been mapped by some other s element



class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        sMap = {}
        tSet = set()

        for i, sChar in enumerate(s):
            tChar = t[i]

            if sChar in sMap:
                sCharMapVal = sMap[sChar]
                if sCharMapVal != tChar:
   
                    return False
            else:
                #if sChar not in sMap
                if tChar in tSet:
                    return False
                else:
                    sMap[sChar] = tChar
                    tSet.add(tChar)
            
        return True

        