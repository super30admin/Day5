"""
Approach same as problem 2

Works on leet code

Time and space complexity of O(n)
"""
class Solution(object):
    def wordPattern(self, s, t):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        S = {}
        T = {}
        if len(s) != len(t.split()) :
            return False
        
        for i,j in zip(s,t.split()):
            if S.get(i) and (S[i] != j) :
                return False
            
            if T.get(j) and (T[j] != i) :
                return False
            
            
            if (not S.get(i)) and (not T.get(i))  :
                S[i] = j
                T[j] = i
                
        
        return True
