"""
// Time Complexity :O(n) where n=number of words
// Space Complexity :O(1) 2 hashmaps will store n keys
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NA
//Explanation:
If character in pattern not in hashMap-> Add it.
If pattern[character] already present in hashMap->check
it is equal to string[word]. If it is not, return False.
"""
class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        pattern = list(pattern)
        s=str.split()
        pHashMap,sHashMap = {},{}

        if len(pattern)!=len(s):
          return False

        for i in range(len(pattern)):
          pchar=pattern[i]
          sword= s[i]
          #print(pchar,sword)

          if pattern[i] not in pHashMap:
            pHashMap[pchar] = sword
          else:
            if pHashMap.get(pchar) != sword:
              return False

          if s[i] not in sHashMap:
            sHashMap[sword] = pchar
          else:
            if sHashMap.get(sword) != pchar:
              return False
        return True
