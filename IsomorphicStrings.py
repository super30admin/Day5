class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
    """
    Use two hash maps to map string1 to string2, and map string2 to string1
    """
        if len(s) != len(t):
            return False
        
        hash_stoT = dict()
        hash_ttoS = dict()
        
        for index in range(len(s)):
            if s[index] not in hash_stoT:
                hash_stoT[s[index]] = t[index]
            else:
                if hash_stoT[s[index]] != t[index]:
                    return False
                
            if t[index] not in hash_ttoS:
                hash_ttoS[t[index]] = s[index]
            else:
                if hash_ttoS[t[index]] != s[index]:
                    return False
        
        return True