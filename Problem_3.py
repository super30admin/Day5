# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : Similar to problem 2

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        val = s.split()
        if len(pattern) != len(val):
            return False
        p_data=dict()
        v_data=dict()
        for x in range(len(pattern)):
            p = pattern[x]
            v = val[x]
            if p not in p_data:
                p_data[p]=v
            else:
                if p_data[p] != v:
                    return False

            if v not in v_data:
                v_data[v]=p
            else:
                if v_data[v] != p:
                    return False
        return True