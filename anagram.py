# Time Complexity : O(nklogk) - k is length of each string in array
# Space Complexity : O(p) - p is the max number of keys
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if len(strs) == 1:
            return [strs]
        store,out = {},[]
        for i in strs:
            x = "".join(sorted(i))
            if x in store.keys():
                store[x].append(i)
            else:
                store[x] = [i]
        for i in store.values():
            out.append(i)
        return out  

