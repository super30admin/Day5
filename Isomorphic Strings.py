class Solution:
    # leetcode URL : https://leetcode.com/problems/isomorphic-strings/
    # Problem : 205. Isomorphic Strings
    # Time Complexity : O(n) since search and add in dictionary/set is O(1)
    # Space Complexity : O(2n) = O(n)
    def isIsomorphic(self, s: str, t: str) -> bool:
        map_dict = dict()
        t_set = set()
        
        for (s1, t1) in zip(s,t):
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