//Time complexity = O(nklogk)
//where n is the length of string array
//where k is the length of the maximum string in string array
//space complexity = O(nk)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = collections.defaultdict(list)
        for i in strs:
            ans[tuple(sorted(i))].append(i)
        return ans.values()
        
