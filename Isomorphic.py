class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        '''
        Complexity: 
        Time: O(n), where n is length of s
        Space: O(n), where n is length of s
        '''

        x = {}
        y = {}
        for i in range(0,len(s)):
            if(s[i] not in x.keys()):
                x[s[i]] = t[i]
            else:
                if(x[s[i]] != t[i]):
                    return False
            
            if(t[i] not in y.keys()):
                y[t[i]] = s[i]
            else:
                if(y[t[i]] != s[i]):
                    return False
        
        return True
        
                