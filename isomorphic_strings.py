'''
Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Time complexity: O(nlogm) => O(n) for each letter + O(logm) for sorting values
Space complexity: O(2n) 
Implementation: Create a dictionary for s and t such that:

*** returns True ***
s = egg, t = add
d1 = {
  e: [0],
  g: [1,2]
}
sorted d1 values = [0,1,2]
d2 = {
  a: [0],
  d: [1,2]
}
sorted d2 values = [0,1,2]

*** returns False ***
s = badc, t = baba
d1 = {
  b: [0],
  a: [1],
  d: [2],
  c: [3]
}
sorted d1 values = [0,1,2,3]
d2 = {
  b: [0,2],
  a: [1,2]
}
sorted d2 values = [[1,2], [0,2]]

'''
class Solution:
    def is_isomorphic(self, s, t):
        d1,d2 = {},{}
        for index,letter in enumerate(s):
            d1[letter] = d1.get(letter, []) + [index]
        for index,letter in enumerate(t):
            d2[letter] = d2.get(letter, []) + [index]
        return sorted(d1.values()) == sorted(d2.values())

# Driver code
sol = Solution()
s = "egg" 
t = "add"
print(sol.is_isomorphic(s, t))