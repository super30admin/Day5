'''
    Time Complexity: O(n)
    Space Complexity: O(1)
    Approach: Use 2 hashmaps to map the values. 
    If the key is not present add it and map.
    If present, check if the mapped value and actual value are same.
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        # tMap = {}
        sSet = set()

        for i in range(len(s)):
            if s[i] not in sMap:
                if t[i] in sSet:
                    return False
                sMap[s[i]] = t[i]
                sSet.add(t[i])
            elif sMap[s[i]] != t[i]:
                return False
            
            # if t[i] not in tMap:
            #     tMap[t[i]] = s[i]
            # elif tMap[t[i]] != s[i]:
            #     return False

        return True
