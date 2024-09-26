#Time complexity is O(n)
#space complexity is O(1)


class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s)!=len(t): return False
        sdict={}
        tdict={}

        for i in range(0,len(s)):

            if s[i] in sdict:
                if sdict[s[i]]!=t[i]:
                
                    return False
            else:
                    sdict[s[i]]=t[i]
        
            if t[i] in tdict:
                if  tdict[t[i]]!=s[i]: 
                
                    return False
            else:
                    tdict[t[i]]=s[i]
        return True 
"""
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
"""
