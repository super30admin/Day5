#205. Isomorphic Strings
# TC - > O(n)
#Space-> O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s)!=len(t):
            return False 
        
        myDict1 = {}
        myDict2 = {}
        t = str.split('')
        
        for i in range(len(s)):
            
            if s[i] not in myDict1.keys():
                myDict1[s[i]] = t[i]
            else:
                if myDict1[s[i]]!=t[i]:
                    return False
           
        
            if t[i] not in myDict2.keys():
                myDict2[t[i]] = s[i]
            else:
                if myDict2[t[i]]!=s[i]:
                    return False
        
        return True
        