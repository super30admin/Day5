# Time complexity : O(n) where n is the length of the input strings(s/t)
# Space complexity : O(n)
# Did this code run on leetcode : Yes
# Any difficulty solving this problem : No


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        shmap = {}
        thmap = {}
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            if s[i] in shmap:
                if shmap[s[i]] != t[i]:
                    return False
            if t[i] in thmap:
                if thmap[t[i]] != s[i]:
                    return False
            else:
                shmap[s[i]] = t[i]
                thmap[t[i]] = s[i]
        return True


solution = Solution()
print(solution.isIsomorphic("egg", "add"))
print(solution.isIsomorphic("paper", "title"))
print(solution.isIsomorphic("foo", "bar"))
