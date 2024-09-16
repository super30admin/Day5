#Time complexity : O(n)
#Space Complexity : O(n)
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        S = {}
        T = {}
        for i,j in zip(s,t):
            if S.get(i) and (S[i] != j) :
                return False
            
            if T.get(j) and (T[j] != i) :
                return False
            
            
            if (not S.get(i)) and (not T.get(i))  :
                S[i] = j
                T[j] = i
                
        
        return True
            