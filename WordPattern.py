# TC: O(N) where N is length of strings.     
# SC: O(1) since we will be needing only 26 + 26 space for hashmap at max, therefore constant space. 

class Solution:   
  def wordPattern(self, pattern: str, s: str) -> bool:
        dict_p = {}
        dict_s = {}
        l = s.split()

        if len(pattern) != len(l):
            return False
        for i in range(len(pattern)):
            if not pattern[i] in dict_p:
                dict_p[pattern[i]] = l[i]
            else:
                if dict_p.get(pattern[i]) != l[i]:
                    return False
            
            if not l[i] in dict_s:
                dict_s[l[i]] = pattern[i]
            else:
                if dict_s.get(l[i]) != pattern[i]:
                    return False
                
        return True
