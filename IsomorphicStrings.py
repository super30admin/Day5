# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A

# Your code here along with comments explaining your approach
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if(s==None or t==None):
            return False
        if(len(s)==0 or len(t)==0 or len(s)!=len(t)):
            return False
        #Declare a HashMap and Hashset
        sMap = {}
        tSet = set()
        #Iterate through the length of s or t as both would be equal
        for i in range(len(s)):
            #Storing the character from s and corresponding character from t in sChar and tChar
            sChar = s[i]
            tChar = t[i]
            #Check if character is already present in sChar is mapped to tChar already in sMap
            if(sChar in sMap):
                #To check if the existing sChar matches incoming tChar 
                if(sMap[sChar] != tChar):
                    return False
            #If sChar not present in sMap        
            else:
                #Check if tChar is present tSet which denotes it is mapped with some other sChar previously
                if(tChar in tSet):
                    return False
                #Else map sChar to tChar in sMap and add tChar to tSet
                tSet.add(tChar)
                sMap[sChar]=tChar
        return True