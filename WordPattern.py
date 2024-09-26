#Time Complexity : 0(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        d={}
        l=list(s.split(" "))
        
        if len(l)!= len(pattern):
            return False 
        
        if len(set(l))!=len(set(pattern)):
            return False
        
        for i in range(len(l)):
            if pattern[i] not in d:
                d[pattern[i]]= l[i]
                
            elif d[pattern[i]]!=l[i]:
                return False
            
        return True