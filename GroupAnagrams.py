class Solution:
    # TC: O(nk), SC: O(nk)
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = collections.defaultdict(list)
        for str in strs:
            count=[0] * 26
            for c in str:
                count[ord(c)-ord('a')] += 1
            result[tuple(count)].append(str)  
        return result.values()