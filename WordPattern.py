# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict = {}
        # Split the string
        split = s.split(' ')
        # If the lenght of the pattern and the string don't match, return False
        if len(pattern) != len(split):
            return False

        for i in range(len(split)):
            # split[i] is a new key
            if split[i] not in dict.keys():
                # pattern[i] has been seen before, even though split[i] wasn't. This means the string is not isomorphic and the pattern doesn't match
                if pattern[i] in dict.values():
                    return False
                # Add split[i] to the dict as a key with pattern[i] as it's mapped value
                dict[split[i]] = pattern[i]
            else:
                # split[i] is already in dict, now we check if pattern[i] matches with value of split[i] in the dict
                if pattern[i] != dict[split[i]]:
                    return False
        return True
