# Time Complexity : O(N)
# Space Complexity : O(N)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        memo = {}
        for i in strs:
            reframed_string = "".join(sorted(i))
            if reframed_string in memo:
                memo[reframed_string].append(i)
            else:
                memo[reframed_string] = [i]
        return list(memo.values())
