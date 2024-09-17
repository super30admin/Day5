# Time: O(N) | Space: O(M)
# Where N is len of s
# M is number of unique characters in s

class Solution:
    def isIsomorphic(self, s, t):
        char_map = {}
        values = set()
        for i in range(len(s)):
            char = s[i]
            if char in char_map:
                if char_map[char] != t[i]:
                    return False
            else:
                if t[i] in values:
                    return False
                char_map[char] = t[i]
                values.add(t[i])
        return True



if __name__ == "__main__":
    print(Solution().isIsomorphic("egg", "add"))
    print(Solution().isIsomorphic("foo", "bar"))
    print(Solution().isIsomorphic("paper", "title"))
    print(Solution().isIsomorphic("ab", "aa"))