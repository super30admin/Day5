 # Time Complexity : O(n) + O(mlogm) m is length of string
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# sort the strings first and group them according to same key then add the vales to returning array


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sortedStr = [sorted(i) for i in strs]
        sortedStr = ["".join(i) for i in sortedStr]
        print(sortedStr)
        a = {}
        for i in range(len(sortedStr)):
            if sortedStr[i] not in a:
                a[sortedStr[i]] = [strs[i]]
            else:
                a[sortedStr[i]].append(strs[i])
        out = []
        for i in a:
            out.append(a[i])
        return out