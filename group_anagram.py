# Time Complexity :- O(1)
# Space Complexity :- O(1)
# Approach :- we used hashmap to store simillar occurances string where key is e.g. 1a1e1t : value is [eat],[ate] and then we return the values from hashmap as those will be the only anagrams stored in hashmap
class Solution:
    def groupAnagrams(self,strs:List[str]) -> List[List[str]]:
        map = defaultdict(list)

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord("a")] += 1
            map[tuple(count)].append(s)
        return list(map.values())
