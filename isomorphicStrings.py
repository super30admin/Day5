class Solution(object):
    def IsormorphicStrings(self,s, t):
        if len(s) != len(t):
            return False
        s_map = {}
        t_map = {}
        for i in range(len(s)):
            if s[i] in s_map and s_map[s[i]] != t[i]:
                return False
            elif t[i] in t_map and t_map[t[i]] != s[i]:
                return False
            s_map[s[i]] = t[i]
            t_map[t[i]] = s[i]
        return True

if __name__ == "__main__":
    iso_str = Solution()
    res = iso_str.IsormorphicStrings("eye", "add")
    print(res)

        