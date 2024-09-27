class Solution(object):
    
    def __init__(self):
        
        self.hash1 = {}
        self.hash2 = {}
        self.count = 0
    
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        i = 0
        if(len(s) != len(t)):
            
            return False
        
        
        while(i < len(s)):
            
            if(s[i] not in self.hash1 and t[i] not in self.hash2):
                    
                self.hash1[s[i]] = t[i]
                self.hash2[t[i]] = s[i]
                
            elif(self.hash1.get(s[i]) != t[i] or self.hash2.get(t[i]) != s[i]):
                    
                return False
                    
            i = i + 1
            
        return True
                    

