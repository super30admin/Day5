'''
## Problem 2:
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.

'''

'''
Approach:

Solution1:
- use 2 hashmaps to maintain character mappings, one for s to t mapping and other for t to s.
- iterate through s and check the s to t and t to s mappings in the 2 hashmaps, if the current characters do not match either of the mappings, return False.
- if there is no mapping, add the mapping to the hashmaps
- at the end of the iteration, return True.

Solution2:
- same as Solution 1 except we use a single hashmap to maintain both the s to t and t to s mappings.
- in order to differentiate between the 2 types of mappings, we add a prefix 's_' and 't_' to s and t character keys respectively. 

Solution3:
- same as solution 1 except we use a hashset instead of a hashmap to maintain t to s mapping.
- if at any point in the iteration, if s to t mapping does not exist but the t to s hashset has the corresponding t character,
  that means it was mapped previously to some other character from s and thus return False.

  
Time Complexity: All 3 solutions take O(n) time.
Space Complexity: All 3 solutions take O(1) space.
'''

class Solution1:
  def isIsomorphic(self, s: str, t: str) -> bool:
    if len(s) != len(t):
      return False
    sMap = {}
    tMap = {}
    for idx in range(len(s)):
      sChar = s[idx]
      tChar = t[idx]
      if sChar in sMap:
        if sMap[sChar] != tChar:
          return False
      else:
        sMap[sChar] = tChar

      if tChar in tMap:
        if tMap[tChar] != sChar:
          return False
      else:
        tMap[tChar] = sChar
    return True

class Solution2:
  def isIsomorphic(self, s: str, t: str) -> bool:
    if len(s) != len(t):
      return False
    charMap = {}
    for idx in range(len(s)):
      sCharKey = 's_' + s[idx]
      sCharVal = s[idx]
      tCharKey = 't_' + t[idx]
      tCharVal = t[idx]
      if sCharKey in charMap:
        if charMap[sCharKey] != tCharVal:
          return False
      else:
        charMap[sCharKey] = tCharVal

      if tCharKey in charMap:
        if charMap[tCharKey] != sCharVal:
          return False
      else:
        charMap[tCharKey] = sCharVal
    return True

class Solution3:
  def isIsomorphic(self, s: str, t: str) -> bool:
    if len(s) != len(t):
      return False
    sMap = {}
    tSet = set()
    for idx in range(len(s)):
      if s[idx] not in sMap:
        if t[idx] in tSet:
          return False
        sMap[s[idx]] = t[idx]
        tSet.add(t[idx])
      elif sMap[s[idx]] != t[idx]:
          return False
    return True


s1 = "egg"
t1 = "add"

s2 = "bar"
t2 = "foo"

s3 = "paper"
t3 = "title"

print('Solution1:')
sol1 = Solution1()
print('s1 = {}, s2 = {}, isIsomorphic() = {}'.format(s1, t1, sol1.isIsomorphic(s1, t1)))
print('s2 = {}, s2 = {}, isIsomorphic() = {}'.format(s2, t2, sol1.isIsomorphic(s2, t2)))
print('s3 = {}, s3 = {}, isIsomorphic() = {}'.format(s3, t3, sol1.isIsomorphic(s3, t3)))

print()
print('Solution2:')
sol2 = Solution2()
print('s1 = {}, s2 = {}, isIsomorphic() = {}'.format(s1, t1, sol2.isIsomorphic(s1, t1)))
print('s2 = {}, s2 = {}, isIsomorphic() = {}'.format(s2, t2, sol2.isIsomorphic(s2, t2)))
print('s3 = {}, s3 = {}, isIsomorphic() = {}'.format(s3, t3, sol2.isIsomorphic(s3, t3)))

print()
print('Solution3:')
sol3 = Solution3()
print('s1 = {}, s2 = {}, isIsomorphic() = {}'.format(s1, t1, sol3.isIsomorphic(s1, t1)))
print('s2 = {}, s2 = {}, isIsomorphic() = {}'.format(s2, t2, sol3.isIsomorphic(s2, t2)))
print('s3 = {}, s3 = {}, isIsomorphic() = {}'.format(s3, t3, sol3.isIsomorphic(s3, t3)))
