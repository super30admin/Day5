#Time complexity : O(n)
#Space Complexity : O(n)
class Solution(object):
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        S = {}
        T = {}
        if len(pattern) != len(str.split()):
                return False
        for i,j in zip(pattern,str.split()):
            
            if S.get(i) and (S[i] != j) :
                return False
            
            if T.get(j) and (T[j] != i) :
                return False
            
            
            if (not S.get(i)) and (not T.get(i))  :
                S[i] = j
                T[j] = i
                
        
        return True
    