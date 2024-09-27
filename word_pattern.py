'''
Given a pattern and a string str, find if str follows the same pattern.

Time complexity: O(nlogm) => O(n) for each letter/word + O(logm) for sorting values
Space complexity: O(2n)
'''
class Solution:
    def hasWordPattern(self, pattern, s):
        d1,d2 = {}, {}
        for index, letter in enumerate(pattern):
            d1[letter] = d1.get(letter, []) + [index]
        for index, word in enumerate(s.split(' ')):
            d2[word] = d2.get(word, []) + [index]
        return sorted(d1.values()) == sorted(d2.values())

# Driver code
sol = Solution()
pattern = "abba" 
s = "dog cat cat dog"
print(sol.hasWordPattern(pattern, s))