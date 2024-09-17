# Time Complexity : O(n) as we process through each character in pattern and words
# Space Complexity : O(1) # Auxiliary space is 2 * O(26) which is constant
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        h1 = {}
        h2 = {}
        words = s.split() # Split s into an array of words
        if len(pattern)!= len(words):
            return False # If words and pattern have different length they don't have same pattern
        for i in range(len(pattern)):
            if (pattern[i] in h1.keys() and h1[pattern[i]]!=words[i]) or (words[i] in h2.keys() and h2[words[i]]!=pattern[i]):
                # If the current letter in pattern already has a key in h1 and the value is not the corresponding 
                # word in words then return False. Return false for the same vice versa as well
                return False
            h1[pattern[i]]=words[i] # Make the current letter in pattern a key in h1 with value as current word
            h2[words[i]]=pattern[i] # Make the current word in words as key in h2 with value as current letter in pattern
        return True # If we exit the above loop without returning False it means both have same pattern and we return True
