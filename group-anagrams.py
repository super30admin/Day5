# Time Complexity : O(n(k log k))
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes

from typing import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap = {}
        out = []

        for word in strs:
            w = sorted(word)
            w = tuple(w)

            if w in hashMap.keys():
                hashMap[w].append(word)

            else:
                hashMap[w] = [word]

        for key in hashMap.keys():
            out.append(hashMap[key])

        return out
