#Problem 2 : https://leetcode.com/problems/isomorphic-strings/
#Test Cases Passed on LeetCode
#Space Complexity-O(n)
#Time Complexity-O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d={}
        for i in range(len(s)):
            if(s[i] in d):
                if(t[i] != d[s[i]]):
                    return False
            if(s[i] not in d):
                if(t[i] in d.values()):
                    return False
            d[s[i]] = t[i]
        return True
sol=Solution()
s=input("Enter first string: ")
print()
t=input("Enter second string: ")
print()
output=sol.isIsomorphic(s,t)
print("Output :")
print(output)