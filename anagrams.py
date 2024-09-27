from typing import List
class Solution:
    # sorted solution
    # TC: O(n x k log (k)) + O(n) =  O(n*klog(k))
    # SC: O(n)
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}
        for string in strs:
            sortedStr = ''.join(sorted(string))
            if not sortedStr in hashmap:
                hashmap[sortedStr] = [string]
            else:
                hashmap[sortedStr] = hashmap[sortedStr] + [string]
        result = []
        for k,v in hashmap.items():
            result.append(v)
        return result