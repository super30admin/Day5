# time: O(n)
# space: O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split()
        if len(s)!=len(pattern):
            return False

        pattern_dict = {}
        s_dict = {}

        for a,b in zip(pattern, s):
            if (a in pattern_dict and pattern_dict[a]!=b) or (b in s_dict and s_dict[b]!=a):
                return False
            
            pattern_dict[a] = b
            s_dict[b] = a

        return True