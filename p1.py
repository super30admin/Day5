# Time Complexity : O(k*n)
# Space Complexity : O(k*n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach


class Solution:

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        l = [0 for i in range(26)]

        d = {}
        for s in strs:

            freq = [0 for i in range(26)]

            for c in s:
                freq[ord(c) - 97] += 1

            freq = tuple(freq)

            if freq in d:
                d[freq].append(s)

            else:
                d[freq] = [s]

        a = []

        for f in d:
            a.append(d[f])

        return a