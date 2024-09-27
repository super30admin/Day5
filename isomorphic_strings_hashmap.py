'''
Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Time complexity: O(n)
Space complexity: O(2n) 
Implementation: Create 2 dictionaries for s and t such that:
s = 'egg'
t = 'add'

d1 = {
  e: a,
  g: d
}
d2 = {
  a: e,
  d: g
}
'''
class Solution:
    def is_isomorphic(self, s, t):
        d1,d2 = {},{}
        for i in range(len(s)):
          char_s = s[i]
          char_t = t[i]
          
          if d1.get(char_s) and d1.get(char_s) != char_t:
            return False
          else:
            d1[char_s] = char_t
          
          if d1.get(char_t) and d1.get(char_t) != char_s:
            return False
          else:
            d1[char_t] = char_s
        return True

# Driver code
sol = Solution()
s = "egg" 
t = "add"
print(sol.is_isomorphic(s, t))