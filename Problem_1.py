# solution
# created a dictionary res using defaultdict - which creates a default list if there are no value for the key
# sorting the string and storing the sorted string as key
# adding all string to the hashmap with same keys
import collections
from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = collections.defaultdict(list)

        for str in strs:
            res[tuple(sorted(str))].append(str)

        return res.values()

if __name__ == "__main__":
    sol_obj = Solution()
    strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
    print(sol_obj.groupAnagrams(strs))