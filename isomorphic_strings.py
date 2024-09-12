
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping = defaultdict(lambda:None)
        s_len = len(s)
        t_len = len(t)
        if s_len!=t_len: return False
        for i in range(s_len):
            m = mapping[s[i]]
            if m:
                if m != t[i]:
                    return False
            else:
                if t[i] in mapping.values(): return False
                mapping[s[i]] = t[i]
        return True