# Explaination: Sort each word to create a unique key and use a dictionary to group anagrams together.
# Sorting each word takes O(KlogK) (where K is the max length of a word).
# Iterating over N words gives a total time complexity of O(NKlogK).
# Space complexity is O(NK) since we store all words in a dictionary.
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = collections.defaultdict(list)
        for s in strs:
            ans[tuple(sorted(s))].append(s)
        return list(ans.values())
    