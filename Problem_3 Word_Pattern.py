# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
#
#
# // Your code here along with comments explaining your approach

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        list1 = s.split(' ')
        if len(pattern) != len(list1):
            return False
        hashmap1 = {}
        hashmap2 = {}
        for i in range(len(pattern)):
            if pattern[i] not in hashmap1.keys():
                hashmap1[pattern[i]] = list1[i]
            else:
                if hashmap1[pattern[i]] != list1[i]:
                    return False
        for i in range(len(pattern)):
            if list1[i] not in hashmap2.keys():
                hashmap2[list1[i]] = pattern[i]
            else:
                if hashmap2[list1[i]] != pattern[i]:
                    return False
        return True
