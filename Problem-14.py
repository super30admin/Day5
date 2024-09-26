"""
Time complexity: O(n)
Space complexity: O(n)
Approach: Maintain a hashmap, mapping each unique letter in pattern to each unique word in s.
            Maintain a set to mark all the unique words in s that have been already mapped.
            When a new letter in pattern is mapped to a word different from one in the hashmap or
            if a new letter is mapped to a word in t that is already mapped to a different letter
            then we return false
            else we return true.

"""
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split()
        if len(s) != len(pattern):
            return False
        mapping = {}
        completed_set = set()
        for i in range(len(s)):
            if pattern[i] in mapping:
                if mapping[pattern[i]] != s[i]:
                    return False
            else:
                if s[i] in completed_set:
                    return False
                else:
                    mapping[pattern[i]] = s[i]
                    completed_set.add(s[i])
        return True