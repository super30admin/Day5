# Time Complexity: O(NK)O(NK), where N is the length of strs, and K is the maximum length of a string in strs.
# Space Complexity: O(NK)
class Solution:
    def groupAnagrams(strs):
        ans = collections.defaultdict(list)
        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            ans[tuple(count)].append(s)
        return ans.values()
