# Time Complexity : O(N) where N is length of the string
# Space Complexity : O(L) where L is the number of unique words in s. Another hashmap takes O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split()
        if len(s) != len(pattern):
            return False
        hashmapA = {}
        hashmapB = {}
        i = 0
        while i < len(pattern):
            if pattern[i] in hashmapA and s[i] in hashmapB:
                if hashmapA[pattern[i]] != s[i] or hashmapB[s[i]] != pattern[i]:
                    return False
            else:
                if pattern[i] not in hashmapA and s[i] not in hashmapB:
                    hashmapA[pattern[i]] = s[i]
                    hashmapB[s[i]] = pattern[i]
                else:
                    return False
            i += 1
        return True


solution = Solution()
print(f'OUTPUT >> {solution.wordPattern("aaaa",  "dog cat cat dog")}')
print(f'OUTPUT >> {solution.wordPattern("abba",  "dog cat cat dog")}')
print(f'OUTPUT >> {solution.wordPattern("abc", "b c a")}')