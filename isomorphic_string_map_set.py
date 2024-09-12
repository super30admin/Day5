#Time Complexity: O(N) We process each character in both the strings exactly once to determine if the strings are isomorphic.
#Space Complexity : O(1) as we have range of ascii character is fixed and keys in the dictionary are valid ascii character
#did you code run on leetcode - yes
#problem uses one hash map and one set

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tset = set()
        if len(s) != len(t): return False
        for k,v in zip(s,t):
            if k in  sMap.keys():
                if sMap[k] != v:
                    return False
                sMap[k] = v
            elif v in tset:
                return False
            else:
                sMap[k] = v
                tset.add(v)
        return True
            
        print(sMap)
        print(tMap)
        
