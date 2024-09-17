class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        #with 2 dictionaries
        #Time O(n), n=number of characters in s
        #Space O(n), 2 dictionaries
        store1={}
        store2={}
        for i in range(len(s)):
            if s[i] in store1 and store1[s[i]]!=t[i]:
                return False
            else:
                store1[s[i]]=t[i]
            
            if t[i] in store2 and store2[t[i]]!=s[i]:
                return False
            else:
                store2[t[i]]=s[i]
        return True
      #https://leetcode.com/submissions/detail/514608419/
