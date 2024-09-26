#Time complexity: O(n) where n is the number of words  
#Space complexity: O(n) where n is the number of words and all words are unique
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        # One hashmap for pattern -> words
        mapping_ch = {}
        # One hashmap for words -> pattern
        mapping_words = {}
        words = s.split(' ')
        
        # Base condition
        if len(words) != len(pattern):
            return False

        #Iterate through pattern , check if not present.
        for idx,el in enumerate(pattern):
            if el in mapping_ch:
                if mapping_ch[el]  != words[idx]:
                    return False
            else:
                mapping_ch[el] = words[idx]
        
        #Iterate through words , check if not present.
        for idx,el in enumerate(words):
            if el in mapping_words:
                if mapping_words[el] != pattern[idx]:
                    return False
            else:
                mapping_words[el] = pattern[idx]
        return True