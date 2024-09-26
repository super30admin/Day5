class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        '''
        Missed Edge Cases, Found wrong complexity initially
        Complexity: 
        Time: O(n) where n is number of words
        Space: O(n*k) where k is size of word and n is number of unique words/patterns. Since n can be maximum of 26. So space             complexity is O(k)
        '''
        x = s.split(" ")
        y = {}
        z = {}
        if(len(x)!=len(pattern)):
            return False
        
        for i in range(0,len(x)):
            if pattern[i] in y.keys():
                if(y[pattern[i]]!=x[i]):
                    return False
            else:
                y[pattern[i]] = x[i]
            
            if x[i] in z.keys():
                if(z[x[i]]!=pattern[i]):
                    return False
            else:
                z[x[i]] = pattern[i]
        
        return True