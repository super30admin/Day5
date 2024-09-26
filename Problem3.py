#Problem 3 : https://leetcode.com/problems/word-pattern/
#Test Cases Passed on LeetCode
#Space Complexity-O(n)
#Time Complexity-O(n)
class Solution:
    def wordPattern(self, pattern ,str):
        d={}
        lst=str.split()
        if len(lst)!=len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] in d:
                if d[pattern[i]]!=lst[i]:
                    return False
            if pattern[i] not in d:
                if lst[i] in d.values():
                    return False
            d[pattern[i]]=lst[i]
        return True
sol=Solution()
pattern=input("Enter pattern: ")
print()
str=input("Enter string: ")
print()
output=sol.wordPattern(pattern,str)
print("Output :")
print(output)