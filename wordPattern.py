class Solution(object):
    def wordPattern(self, pattern, s):
        s = s.split(" ")
        if len(pattern) != len(s):
            return False

        pattern_map = {}
        s_map = {}

        for i in range(len(pattern)):
            if pattern[i] in pattern_map and pattern_map[pattern[i]] != s[i]:
                return False
            elif s[i] in s_map and s_map[s[i]] != pattern[i]:
                return False
            pattern_map[pattern[i]] = s[i]
            s_map[s[i]] = pattern[i]
        return True

if __name__ == "__main__":
    wp = Solution()
    res = wp.wordPattern("abba", "dog fish fish cat")
    print(res)