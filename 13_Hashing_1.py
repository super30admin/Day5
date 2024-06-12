// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : all good
// Your code here along with comments explaining your approach
// I just simply maintained two hashmaps s2t and t2s to check the isomorphic conditions and added the element if all conditions satisfied.
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s2t, t2s = {}, {}
        for i in range(len(s)):
            if s[i] in s2t and s2t[s[i]] != t[i]:
                return False
            if t[i] in t2s and t2s[t[i]] != s[i]:
                return False
            s2t[s[i]] = t[i]
            t2s[t[i]] = s[i]
        return True