#  Time Complexity : O(n)
#  Space Complexity : O(n)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

#  https://leetcode.com/problems/word-pattern/description/
#  Your code here along with comments explaining your approach 
#  I created a dictionary where the key is the character from pattern and
#  the value is the string from s. I also created a set to keep track of the mapped values.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        char = {} # char --> string
        word = set()

        words = s.split(' ')
        if len(words) != len(pattern):
            return False
        
        for i in range(len(pattern)):
            c = pattern[i]
            string = words[i]
            if c in char:
                if char[c] != string:
                    return False
            else:
                if string in word:
                        return False
                char[c] = string
                word.add(string)
        
        return True