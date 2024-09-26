class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict1 = {}
        dict2 = {}
        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            if t[i] not in dict1:
                dict1[t[i]] = s[i]
        
        st1 = ''

        for i in range(len(t)):
            st1 = st1 + dict1[t[i]]
                
        for i in range(len(s)):
            if s[i] not in dict2:
                dict2[s[i]] = t[i]
        print(dict2)
        
        st2 = ''

        for i in range(len(t)):
            st2 = st2 + dict2[s[i]]
                    
        if st1 == s and st2 == t:
            return True
        else:
            return False