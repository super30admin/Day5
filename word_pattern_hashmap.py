'''
Given a pattern and a string str, find if str follows the same pattern.

Time complexity: O(n)
Space complexity: O(2n)
Implementation: Create 2 dictionaries for s and t
'''
class Solution:
    def hasWordPattern(self, pattern, s):
        d1,d2 = {}, {}
        if len(pattern) != len(s.split(' ')):
            return False
        split_string = s.split(' ')
        
        for i in range(len(pattern)):
            char_pattern = pattern[i]
            char_s = split_string[i]
            
            if d1.get(char_pattern) and d1.get(char_pattern) != char_s:
                return False
            else:
                d1[char_pattern] = char_s
            
            if d1.get(char_s) and d1.get(char_s) != char_pattern:
                return False
            else:
                d1[char_s] = char_pattern
                
        return True

# Driver code
sol = Solution()
pattern = "abba" 
s = "dog cat cat dog"
print(sol.hasWordPattern(pattern, s))