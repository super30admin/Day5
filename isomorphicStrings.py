# Time Complexity :  O(n), where n is the length of the s
# Space Complexity : O(n), where n is the combined len(s) + len(t)
# Did this code successfully run on Leetcode : Yes!
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
class Solution(object):
    # making two hashmaps to check if every character of each
    # string maps uniquely to the other, if not return False.
    def isIsomorphic(self, s, t):
        sMap = {}
        tMap = {}
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            if sChar in sMap:
                if sMap[sChar] != tChar:
                    return False
            else:
                sMap[sChar] = tChar

            if tChar in tMap:
                if tMap[tChar] != sChar:
                    return False
            else:
                tMap[tChar] = sChar
        return True


print(Solution().isIsomorphic("egg", "add"))

