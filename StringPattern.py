"""
Given a pattern and a string str, find if str follows the same pattern. 
Here follow means a full match, such that there is a bijection between a 
letter in pattern and a non-empty word in str.

Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true

Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false

Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false

Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false 
Notes: You may assume pattern contains only lowercase letters, and str contains 
lowercase letters that may be separated by a single space.

"""

# Time Complexity : O()
# Space Complexity : O() 
# Did this code successfully run on VSCode : Yes
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        map1 = {}
        map2 = {}

        words = s.split(' ')

        if len(words) != len(pattern):
            return False
        
        for ch, word in zip(pattern, words):

            if ch not in map2:
                if word not in map1:
                    map1[word] = ch
                    map2[ch] = word

                else:
                    return False
            else:
                if map2[ch] != word:
                    return False

        return True

s = Solution()
result = s.wordPattern("abba", "dog cat cat dog")
print(result)

                