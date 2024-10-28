"""
Time complexity: O(n) where n is number of words in string s
Space complexity: O(n), hashmap and hashset will store n strings
"""
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(' ')
        if len(pattern) != len(words):
            return False
        pattern_dict = {}
        hset = set()
        for i, p in enumerate(pattern):
            if p in pattern_dict and pattern_dict[p] == words[i]:
                    continue
            if p not in pattern_dict and words[i] not in hset:
                pattern_dict[p] = words[i]
                hset.add(words[i])
            else:
                return False
        return True
