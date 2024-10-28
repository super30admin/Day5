# FOllowed the exact same pattern as isomorphic string the only change is instead of usign char in values of hmap not its strings
# Time complexity: O(n)
# Space complexity: O(n + 2m)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hmap = {}
        hset = set()
        strs = s.split(" ")
        if len(strs)!= len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] in hmap.keys():
                if strs[i] != hmap[pattern[i]]:
                    return False
            else:
                if strs[i] in hset:
                    return False
                hset.add(strs[i])
                hmap[pattern[i]] = strs[i]
        return True