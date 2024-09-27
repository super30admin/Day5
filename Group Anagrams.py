from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict = defaultdict(list)
        for str in strs:
            index = ''.join(sorted(str))
            dict[index].append(str)
        return dict.values()
