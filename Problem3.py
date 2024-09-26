class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        m1 = {}
        m2 = {}
        words = s.split(" ")
        if (len(pattern) != len(words)):
            return False
        if(len(set(pattern))) != len(set(words)): return False
        
        for j in range(len(words)):
            if(pattern[j] in m1 or words[j] in m2):
                if(m1[pattern[j]] != words[j] and m2[words[j]] != pattern[j]) : return False            
            else:
                m1[pattern[j]] = words[j]
                m2[words[j]] = pattern[j]
                
        return True 
        
