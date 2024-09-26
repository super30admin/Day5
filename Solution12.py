#Time Complexity =O(n)
#Space Complexity=O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result={}
        for x in strs:
            s=''.join(sorted(x))
            if s in result.keys():
                result[s].append(x)
            else:
                result[s]=[x]
        return result.values()