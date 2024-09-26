
#Source Link: https://leetcode.com/problems/isomorphic-strings/
# Time Complexity : O(n)
# Space Complexity : O(1)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dic={}
        
        #return false if length is unequal
        if len(s)!=len(t):
            return False
        #since the length is equal iterate through any of the string's length
        for i in range(len(s)):
            #if s[i] exists as key in dict
            if s[i] in dic: 
                #check for the value from dict if it is equal to the value at the same index in another string
                if dic[s[i]]!= t[i]:
                    return False
            # if the value is not in the dict, add the key-value pair    
            elif t[i] not in dic.values():
                dic[s[i]]=t[i]
                
            else:
                return False
        return True
                
                
                
            
            