# Time Complexity : O(nklogk)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

def groupAnagrams(self, strs):
    d = {}
    for w in sorted(strs):
        key = tuple(sorted(w))
        d[key] = d.get(key, []) + [w]
    return d.values()