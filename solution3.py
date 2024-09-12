#https://leetcode.com/problems/word-pattern/

# // Time Complexity : o(n)
# // Space Complexity : o(number of distinct words in str1)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : keep forgetting I have to check both ways of hashing for the words...
#
#
# // Your code here along with comments explaining your approach
class Solution:
    def wordPattern(self, pattern: str, str1: str) -> bool:
        hm = dict()
        str1 = str1.split()
        if len(pattern) * len(str1) == 0 or len(pattern) != len(str1):
            return False
        for i in range(len(pattern)):
            if pattern[i] in hm:
                if hm[pattern[i]] != str1[i]:
                    return False
            else:
                hm[pattern[i]] = str1[i]
        hm.clear()
        for i in range(len(pattern)):
            if str1[i] in hm:
                if hm[str1[i]] != pattern[i]:
                    return False
            else:
                hm[str1[i]] = pattern[i]

        return True