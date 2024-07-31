# time: O(n* (k log k))
# space: O(26) = O(1)
class Solution(object):
    def groupAnagrams(self, strs):
        # approach;
            #1. sort each string and map each of the oher strings taht have same sorted str
            # prime products: map each str to its prime product as key 
        anaMap = {}
        for s in strs:
            sortedStr = "".join(sorted(s))
            if sortedStr not in anaMap:
                anaMap[sortedStr] = []
            anaMap[sortedStr].append(s)
        return anaMap.values()

