# Time Complexity = O(n) 
# Space Complexity = O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        charD={}
        wordD={}
        
        words=s.split(' ')
        
        if len(words)!=len(pattern):
            return False
        
        for c,w in zip(pattern, words):
            
            if c not in charD:
                
                if w in wordD:
                    return False
                
                else:
                    charD[c]=w
                    wordD[w]=c
            
            elif charD[c]!=w:
                return False
        return True