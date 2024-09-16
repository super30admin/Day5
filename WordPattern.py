# Time complexity : O(n) where n is the length of the input string/pattern
# Space complexity : O(n)
# Did this code run on leetcode : Yes
# Any difficulty solving this problem : No, used the same pattern as Isomorphic Strings to solve this question.


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        shmap = {}
        patternMap = {}

        sList = s.split(" ")

        if len(sList) != len(pattern):
            return False
        for i in range(len(sList)):
            if pattern[i] in patternMap:
                if patternMap[pattern[i]] != sList[i]:
                    return False

            if sList[i] in shmap:
                if shmap[sList[i]] != pattern[i]:
                    return False

            else:
                shmap[sList[i]] = pattern[i]
                patternMap[pattern[i]] = sList[i]
        return True


solution = Solution()
print(solution.wordPattern("abba", "dog cat cat dog"))
print(solution.wordPattern("abba", "dog cat cat fish"))
print(solution.wordPattern("aaaa", "dog cat cat dog"))
print(solution.wordPattern("abba", "dog dog dog dog"))
