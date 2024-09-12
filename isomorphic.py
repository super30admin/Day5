#Time complexity:O(n)
#Space complexity:O(n)
# Ran successfully in Leetcode: Yes

#1. Calculate the length of both length of s and t
#2. Return False if the length of the both strings are not matching.
#3. If x of the string s is in the key and the value of x is not in string t, return False.
#4. If x is not in the key creayed for string s, but the value is in string t, then return False.
 


class Solution:
    def isIsomorphic(self, s, t):
       
        dic={}
        for i,x in enumerate(s):
            if x in dic.keys() and dic[x]!=t[i]:
                return  False
            elif x not in dic.keys() and t[i] in dic.values():
                return False
            else:
                dic[x]=t[i]
                
        return True
