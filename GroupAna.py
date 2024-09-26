class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict1 = {}
        for item in strs:
            list1 = tuple(sorted(item))
            if list1 in dict1:
                l1 = []
                l1 = dict1[list1]
                l1.append(item)
                dict1[list1] = l1
            else:
                l1 = []
                l1.append(item)
                dict1[list1] = l1
                            
        return dict1.values()