#TimeComplexity:O(n) where n is no of words in s
#SpaceComplexity: O(M) where M represents no of characters in s and pattern
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        words=s.split(' ')
        if len(pattern)!=len(words) or len(set(words))!=len(set(pattern)):
            return False
        Dict={}
        for i in range(len(pattern)):
            if pattern[i] not in Dict or Dict[pattern[i]]==words[i]:
                Dict[pattern[i]]=words[i]
            else: return False
        return True    
                  
