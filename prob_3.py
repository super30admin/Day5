# Time Complexity = O(n)
# Space Complexity = O(1)
# Leetcode = yes
# Approach =  Split the string into words and check if the pattern length matches the number of words. Use two hash maps to establish a bijection between pattern characters and words, ensuring consistent mappings during iteration. If any inconsistency arises, return False; otherwise, return True.
class Solution:
    def wordPattern(self, p: str, s: str) -> bool:
        w = s.split()
        if len(p) != len(w):
            return False

        p_to_w = {}
        w_to_p = {}

        for c, word in zip(p, w):
            if c in p_to_w and p_to_w[c] != word:
                return False
            if word in w_to_p and w_to_p[word] != c:
                return False
            p_to_w[c] = word
            w_to_p[word] = c

        return True
