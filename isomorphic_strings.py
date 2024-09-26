# Time complexity
0(n)
# Space complexity 

0(1)



class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        mapping_st={}
        mapping_ts={}
        
        for i in range(len(s)):
            c1,c2 =s[i],t[i]
            if (c1 not in mapping_st) and (c2 not in mapping_ts):
                mapping_st[c1] = c2
                mapping_ts[c2] = c1
                
            elif mapping_st.get(c1) != c2 or mapping_ts.get(c2) != c1:
                return False
            
        return True
