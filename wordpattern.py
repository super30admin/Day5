# Time Complexity : O(N) for length of pattern and string.split()
# Space Complexity : O(1) for the hashmaps i.e O(26)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No, it was very similar to isomorphic words


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        map1 = {}
        map2 = {}
        temp = s.split()
        if len(pattern) == len(temp):
            for i in range(len(pattern)):
                if pattern[i] not in map1:
                    map1[pattern[i]] = temp[i]
                else:
                    if map1[pattern[i]] != temp[i]:
                        return False
                if  temp[i] not in map2:
                    map2[temp[i]] = pattern[i]
                else:
                    if map2[temp[i]] != pattern[i]:
                        return False
        else:
            return False
        return True