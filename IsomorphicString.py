
# Time Complexity : O(nk)
# Space Complexity : O(1) #At max 26 values in map
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :No


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tSet = set()

        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            if s[i] not in sMap:
                if t[i] in tSet:
                    return False

                sMap[s[i]] = t[i]
                tSet.add(t[i])

            else:
                if sMap[s[i]] != t[i]:
                    return False
                
          
        return True

            
        