#290. Word Pattern
# TC - > O(n)
#Space-> O(1)

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        t = str.split(' ')
        if len(pattern)!=len(t):
            return False 
        
        myDict1 = {}
        myDict2 = {}
        
        
        for i in range(len(pattern)):
            
            if pattern[i] not in myDict1.keys():
                myDict1[pattern[i]] = t[i]
            else:
                if myDict1[pattern[i]]!=t[i]:
                    return False
           
        
            if t[i] not in myDict2.keys():
                myDict2[t[i]] = pattern[i]
            else:
                if myDict2[t[i]]!=pattern[i]:
                    return False
        
        return True