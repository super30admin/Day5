# Time Complexity:- O(n) n=length of string s
# Space Complexity:- O(2n) storing two dictionaries of the same size
# Approach:- Store a mapping from s to t and also store the reverse mapping t to s, to
# check if 2 charachters are not being mapped to the same charachter.
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d={}
        e={}
        for i in range(len(s)):
            if s[i] in d:
                if d[s[i]]!=t[i]:
                    return False
            else:
                d[s[i]]=t[i]
            if t[i] in e:
                if e[t[i]]!=s[i]:
                    return False
            else:
                e[t[i]]=s[i]
        return True