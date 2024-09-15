# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes

class Solution:
    def map_str(self, s):
        count = 0
        hashmap = {}
        list = [0]*len(s)
        for i in range(len(s)):
            if s[i] in hashmap.keys():
                list[i] = hashmap[s[i]]
            else:
                hashmap[s[i]] = count
                count += 1
                list[i] = hashmap[s[i]]
        return list

    def isIsomorphic(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        list1 = self.map_str(s)
        list2 = self.map_str(t)
        if list1 == list2:
            return True
        else:
            return False
