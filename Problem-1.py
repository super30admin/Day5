class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = collections.defaultdict(list)
        for s in strs:
            ans[tuple(sorted(s))].append(s)
        return ans.values()
            



# sorting the string and adding those to the dict and then comparing it with the key, if we have more than one occurence of the key then we will append the original value.
# time complexity - O(N) and space complexity - 0(1)
