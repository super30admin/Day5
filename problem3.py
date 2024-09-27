#word pattern
#lowest common ancestor
# // Time Complexity : O(n)  no of words in the string or number of chars in pattern
# // Space Complexity : O(m) number of unique chars in s
# // Did this code successfully run on Leetcode : yes
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dictPattern={}
        dictS={}
        x=s.split()
        if len(pattern)!=len(x):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in dictPattern:
                dictPattern[pattern[i]] = x[i]
            else:
                if dictPattern[pattern[i]] != x[i]:
                    return False
        
            print(dictPattern)
        for i in range(len(x)):
            if x[i] not in dictS:
                dictS[x[i]] = pattern[i]
            else:
                if dictS[x[i]] != pattern[i]:
                    return False
        
        return True