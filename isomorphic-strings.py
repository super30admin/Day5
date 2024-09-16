# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t): return False
        smap=dict()
        tmap=dict()
        for i in range(len(s)):
            s_char=s[i]
            t_char=t[i]
            if s_char in smap:
                if smap[s_char]!=t_char: return False
            else:
                smap[s_char]=t_char
            if t_char in tmap:
                if tmap[t_char]!=s_char: return False
            else:
                tmap[t_char]=s_char
        return True
        
# Using map and set
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t): return False
        mp=dict()
        st=set()
        for i in range(len(s)):
            s_char=s[i]
            t_char=t[i]
            if s_char not in mp:
                if t_char in st:
                    return False
                mp[s_char]=t_char
                st.add(t_char)
            else:
                if mp[s_char]!=t_char: return False
            
        return True