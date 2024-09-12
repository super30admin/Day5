"""
// Time Complexity :O(n) where n=number of words
// Space Complexity :O(1) two hashmaps will store 26*2 keys
// Did this code successfully run on Leetcode :Not LC problem
// Any problem you faced while coding this :
"""
class Solution:
  def isIsomorphic(self, s: str, t: str) -> bool:
    if (len(s)!=len(t)):
      return False

    sHashMap={}
    tHashMap={}

    for char in range(len(s)):
      schar=s[char]
      tchar=t[char]

      if schar not in sHashMap: # if key does not exist add
        sHashMap[schar]=t[char]
      elif sHashMap.get(schar)!=t[char]:#If existing key does not match with char
          return False

      if tchar not in tHashMap:
        tHashMap[tchar]=s[char]
      elif tHashMap.get(tchar)!=s[char]:
          return False
    return True

if __name__=="__main__":
  so=Solution()
  s="egg"
  t="add"
  print(so.isIsomorphic(s,t))
