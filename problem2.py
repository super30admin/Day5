class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        
        return len(set(zip(s, t))) == len(set(s)) == len(set(t))
        
        #tc ---> o(n)
        #sc ---> o(n)
