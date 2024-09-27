# Time Complexity :O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        dic = {}
        words = str.split(" ")
        # map each letter to a word
        if len(words) != len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] in dic:
                if dic[pattern[i]] != words[i]:
                    return False
            else:
                dic[pattern[i]] = words[i]
        myset = set()
        # make sure that each letter has only one word to be equal too
        for i in dic.values():
            if i in myset:
                return False
            else:
                myset.add(i)
        return True
        