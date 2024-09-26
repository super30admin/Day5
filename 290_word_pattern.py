class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pattern = list(pattern)
        s = s.split(" ")
        
        if len(pattern)!=len(s):
            return False 

        if len(set(pattern))!=len(set(s)):
            return False 
        
        forward = {}
        reverse = {}
        
        for i , j in zip(pattern, s):
            if i in forward and forward[i]!=j:
                return False 
            else:
                forward[i]= j
                
            if j in reverse and reverse[j]!=i:
                return False 
            else:
                reverse[j]= i
        return True 