# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        map = {}
        s_arr = s.split()
        if len(pattern) != len(s_arr):
            return False
        for idx, char_val in enumerate(pattern):
            if char_val in map:
                # check if value corresponds to corr val in s arr
                if map[char_val] != s_arr[idx]:
                    return False
            else:
                # check if value is already in map
                if s_arr[idx] in map.values():
                    return False
                else:
                    map[char_val] = s_arr[idx]
        return True



pattern = "abba"
s = "dog cat cat dog"
obj = Solution()
print(obj.wordPattern(pattern, s))
