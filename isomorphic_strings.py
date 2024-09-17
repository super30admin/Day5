# Did this code successfully run on Leetcode : YES

# TC: O(N) : one traversal simultaneously over s and t
# SC: O(1) : constant space: store all ASCII characters and a one-to-one mapping

# mapping where key is s[i] and value is t[i]
# values set to store all t[i] encountered till now
# could have also used mapping.values() but lookup is O(N) for list and O(1) for hashset

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping = {}
        values_set = set()
        for i in range(len(s)):
            if s[i] in mapping:
                if mapping[s[i]] != t[i]:
                    return False
            else:
                if t[i] in values_set:
                    return False
                mapping[s[i]] = t[i]
                values_set.add(t[i])
        return True