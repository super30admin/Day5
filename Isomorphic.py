# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    # We use a Hashtable to map one string onto the other
    # We can see if the two strings can be interchanged
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict = {}
        for i in range(len(s)):
            # s[i] is a new key
            if s[i] not in dict.keys():
                # t[i] has been seen before, even though s[i] wasn't. This means the string is not isomorphic
                if t[i] in dict.values():
                    return False
                # Add s[i] to the dict as a key with t[i] as it's mapped value
                dict[s[i]] = t[i]
            else:
                # s[i] is already in dict, now we check if t[i] matches with value of s[i] in the dict
                if t[i] != dict[s[i]]:
                    return False
        return True
