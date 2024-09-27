#Leetcode 290 - Word Pattern
# Time Complexity : O(n) 
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        #Convert both string into list
        s=list(pattern)
        print(s)
        t=str.split(' ')
        print(t)
        
        if (len(s)!=len(t)) and (len(s) and len(t) is None):
            return False
        
        dict1={}
        dict2={}
        
        #Count the elements of list-1 and stored in dict1
        for ele_s in s:
            if ele_s in dict1:
                dict1[ele_s]+=1
            else:
                dict1[ele_s]=1
                
        #Count the elements of list-2 and stored in dict2
        for ele_t in t:
            if ele_t in dict2:
                dict2[ele_t]+=1
            else:
                dict2[ele_t]=1
        
        """l=list(dict1.values())
        print(l)
        l1=list(dict2.values())
        print(l1)"""
       
        #Compare the values of the both the String
        if (l==l1):
            return True
        else: 
            return False
                