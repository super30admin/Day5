#Time Complexity - O(n)
#Space Complexity - O(1) - Because the alphabets are only 26

#Problem Successfully Submitted on Leetcode




class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sToTDict={}
        tToSDict={}
        
        for i in range(0,len(s)):
            if s[i] not in sToTDict:
                sToTDict[s[i]]=t[i]
            else:
                if sToTDict[s[i]]!=t[i]:
                    return False
            
            if t[i] not in tToSDict:
                tToSDict[t[i]]=s[i]
            else:
                if tToSDict[t[i]]!=s[i]:
                    return False
                
        return True