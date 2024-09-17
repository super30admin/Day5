# Time complexity :- O(N)

# Space Complexity :- O(N)

# Ran on leetcode :- yes. 

# Any problems:- No. 



class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        st = dict()
        
        for i in range(len(s)):
            
            if s[i] not in st and t[i] not in st.values():
                st[s[i]] = t[i]
                continue
                
            if s[i] in st and st.get(s[i]) == t[i]:
                continue
                
            return False
        
        return True