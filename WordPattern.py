"""
Time Compleity: O(n)
Space Complexity: O(n)
"""


def wordPattern(self, pattern, str):
    s = pattern
    t = str.split()
    return map(s.find, s) == map(t.index, t)
