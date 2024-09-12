# Time complexity: O(n)
# Space complexity: O(n)
# Does this code run leetcode: Yes
# Did you face any difficulty in coding the solution: No
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping = dict()
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            if s[i] in mapping.keys():
                if mapping[s[i]] != t[i]:
                    return False
            else:
                if t[i] in mapping.values():
                    return False
                mapping[s[i]] = t[i]
                print(mapping)
        return True