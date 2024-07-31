# Time complexity = O(n) n is no of strings in the list and k is avg length of each string
# space complexity - O(1) => constant hashmap of 26 elements
# Executed on leetcode

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # using one hasmap for s and hashset for t
        if len(s) != len(t):
            return False
        s_map, t_set = {}, set()
        for i,key in enumerate(s):
            if key in s_map:
                if s_map.get(key) != t[i]:
                    return False
            elif t[i] in t_set:
                return False
            s_map[key] = t[i]
            t_set.add(t[i])
        return True


    def isIsomorphic(self, s: str, t: str) -> bool:
        # using two hasmaps 

        if len(s) != len(t):
            return False
        s_map, t_map = {}, {}
        for i,key in enumerate(s):
            if key in s_map:
                if s_map.get(key) != t[i]:
                    return False
            s_map[key] = t[i]
            if t[i] in t_map:
                if t_map.get(t[i]) != key:
                    return False
            t_map[t[i]] = key
        return True

        