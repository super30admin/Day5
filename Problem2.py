#Time Complexity: O(n)
#Space Complexity: O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dic = {}
        st = set()
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            if s[i] not in dic:
                if t[i] in st:
                    return False
                else:
                    dic[s[i]] = t[i]
                    st.add(t[i])
            else:
                if dic[s[i]] != t[i]:
                    return False
                
        return True
        