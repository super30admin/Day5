"""

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:

Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.
 
Example 1:

Input: pattern = "abba", s = "dog cat cat dog"

Output: true

Explanation:

The bijection can be established as:

'a' maps to "dog".
'b' maps to "cat".

Time Complexity : O(N+M)
Space Complexity : O(N)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

"""

# This solution maps each character in the pattern and each word in the string to their respective first occurrence index.  
# If a character and a word appear at the same position but were mapped to different indices earlier, the pattern is not followed.  
# If all indices match correctly, the function returns True; otherwise, it returns False.  

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        mapping = {}
        words = s.split()

        if len(pattern) != len(words):
            return False

        for i in range(len(words)):
            c = pattern[i]
            w = words[i]
            
            c_key = "char_{}".format(c)
            w_key = "word_{}".format(w)

            if c_key not in mapping:
                mapping[c_key] = i
            if w_key not in mapping:
                mapping[w_key] = i

            if mapping[c_key] != mapping[w_key]:
                return False
            
        return True
