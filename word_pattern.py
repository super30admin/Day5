class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        p_w={}
        w_p = {}
        s = s.split()
        if len(pattern) != len(s):
            return False
        for inex,p in enumerate(pattern):
            w = s[inex]
            if p not in p_w and w not in w_p:
                p_w[p]=w
                w_p[w] = p
            elif p_w.get(p)!=w and w_p.get!=w:
                return False
        return True