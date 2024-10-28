"""
Time complexity: O(n) where n is number of characters in string s or t
Space complexity: O(1), hashmap and hashset can hold upto 26 characters at max
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        pattern_dict = {}
        val_set = set()
        for i, p in enumerate(s):
            if p in pattern_dict and pattern_dict[p] == t[i]:
                continue
            if p not in pattern_dict and t[i] not in val_set:
                pattern_dict[p] = t[i]
                val_set.add(t[i])
            else:
                return False
        return True