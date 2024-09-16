class Solution:
    #TC O(nklogk)
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs is None or len(strs) ==0:
            return []
        maps = {}
        for s in strs:
            c = list(s)
            c.sort()
            sort_str = "".join(c)
            if sort_str not in maps:
                maps[sort_str] =  []
            maps[sort_str].append(s)
        print(maps)
        return maps.values()
