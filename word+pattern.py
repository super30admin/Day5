'''
Time Complexity :   
O(n)
Space complexity :
O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
'''
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        word, chara = {}, {}
        n= len(pattern)
        s_word = s.split()
        if n != len(s_word):
            return False

        for i in range(n):
            if pattern[i] not in chara:
                chara[pattern[i]]=s_word[i]
            if chara[pattern[i]]!=s_word[i]:
                return False
            
            if s_word[i] not in word:
                word[s_word[i]]=pattern[i]
            if word[s_word[i]]!=pattern[i]:
                return False

        return True
            
            