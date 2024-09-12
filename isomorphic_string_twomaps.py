#Time Complexity: O(N) We process each character in both the strings exactly once to determine if the strings are isomorphic.
#Space Complexity : O(1) as we have range of ascii character is fixed and keys in the dictionary are valid ascii character
#did you code run on leetcode - yes
#problem uses two hash maps

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tMap = {}
        if len(s) != len(t): return False
        for k,v in zip(s,t):
            if k not in  sMap.keys():
                sMap[k] = v
            elif sMap[k] != v:
                return False
            if v not in  tMap.keys():
                tMap[v] = k
            elif tMap[v] != k:
                return False
        return True
            
        print(sMap)
        print(tMap)
        
