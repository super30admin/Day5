#Time Complexity : O(N ) where N is number of words in s or number of characters in pattern
# Space Complexity : O(N) where N represents unique words in s 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hashmap1 = {}
        hashmap2 = {}
        strList = s.split()
        if len(pattern)  != len(strList):
            return False
        for i in range(0,len(pattern)):
            if pattern[i] in hashmap1:
                if hashmap1[pattern[i]] != strList[i]:
                    return False
            else:
                hashmap1[pattern[i]] = strList[i]
            
            if strList[i] in hashmap2:
                if hashmap2[strList[i]] != pattern[i]:
                    return False
            else:
                hashmap2[strList[i]] = pattern[i]      
        return True

