class Solution:
    # leetcode URL : https://leetcode.com/problems/word-pattern/
    # Problem : 290. Word Pattern
    # Time Complexity : O(n)
    # Space Complexity : O(n)
    def wordPattern(self, pattern: str, s: str) -> bool:
        map_dict = dict()
        t_set = set()
        t = s.split(" ")
        if len(pattern)!=len(t):
            return False
        for (s1, t1) in zip(pattern,t):
            if s1 in map_dict.keys():
                if map_dict[s1] != t1:
                    return False
            else:
                if t1 in t_set:
                    return False
                else:
                    map_dict[s1] = t1
            t_set.add(t1)
        return True