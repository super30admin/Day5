class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict1 = dict()
        for string in strs:
            sortedString = "".join(sorted(string))
            if sortedString not in dict1.keys():
                dict1[sortedString] = list()
            dict1[sortedString].append(string)
        return dict1.values()
