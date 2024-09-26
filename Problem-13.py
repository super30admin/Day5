"""
Time complexity: O(n)
Space complexity: O(n)
Approach: Maintain a hashmap, mapping each unique letter in s to each unique letter in t.
            Maintain a set to mark all the unique letters in t that have been already mapped.
            When a new letter in s is mapped to a letter different from one in the hashmap or
            if a new letter is mapped to a letter in t that is already mapped to a different letter
            then we return false
            else we return true.

"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        smap = {}
        tset = set()
        for i in range(len(s)):
            if s[i] in smap:
                if smap[s[i]] != t[i]:
                    return False
            else:
                if t[i] in tset:
                    return False
                else:
                    smap[s[i]] = t[i]
                    tset.add(t[i])
        return True