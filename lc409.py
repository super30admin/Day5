class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        char_set = set()
        count =0
        for char in s:
            if char in char_set:
                char_set.remove(char)
                count+=2
            else:
                char_set.add(char)
        if len(char_set)>0:
            count+=1
        return count