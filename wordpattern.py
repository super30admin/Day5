# Time Complexity : 0(n)
# Space Complexity : 0(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_array = s.split(" ")
        if len(pattern) != len(s_array):
            return False
        hashset = set()
        hashmap1 = {}
        for i in range(len(pattern)):
            if pattern[i] in hashmap1:
                if hashmap1[pattern[i]] != s_array[i]:
                    return False
            else :
                hashmap1[pattern[i]] = s_array[i]
                if s_array[i] in hashset:
                    return False
                hashset.add(s_array[i])
        return True
