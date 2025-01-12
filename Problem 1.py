#Group anagrams
#Used sorting and hashing approach for storing and returning
#Time: O(nklogk) since we are sorting which takes klok if we assume k is the length of the words
#Space: O(K)
#Yes this worked in leetcode


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if len(strs) == 0:
            return []
        map = {}
        for i in range(len(strs)):
            s = strs[i]
            s = tuple(sorted(s))
            if s not in map:
                map[s] = []
            map[s].append(strs[i])
        return list(map.values())