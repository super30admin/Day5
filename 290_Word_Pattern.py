# Leetcode problem link : https://leetcode.com/problems/word-pattern/
# Time Complexity : O(n) 
#  Space Complexity : O(n) -> basically 0(2n)
#  Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
'''
        Basic approach : O(n2) => check for each word in pattern and vice versa

        Optimized approach: The main idea of this problem is to create a dictionary for both pattern and words in string and check for the one to one mapping (bidirectional)
'''
class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        # get all the words in string assuming escape character is space
        words = str.split(" ")
        pSize = len(pattern)
        sSize = len(words)
        
        # base condition to check if sizes are not equal then definitely not in the same pattern
        if pSize != sSize:
            return False
        # initialize dictionary for both pattern and words
        pMap = {}
        sMap = {}
        for c,word in zip(pattern,words):
            # if character not in pattern dictionary add it
            if c not in pMap:
                pMap[c] = word
            # if already present then mapping should be same as current one else its not following the pattern
            elif pMap[c] != word:
                    return False
            # if word not in string dictionary add it
            if word not in sMap:
                sMap[word] = c
            # if already present then mapping should be same as current one else its not following the pattern
            elif sMap[word] != c:
                    return False
        # if control has reached here that means pattern is matching
        return True
            