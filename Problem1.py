class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list) # charCount -> list of anagrams

        for s in strs:
            count = [0] * 26 # a, b, c,.....z
            for c in s:
                count[ord(c) - ord('a')] += 1 
            res[tuple(count)].append(s) # keys cannot be immutable
        return list(res.values())

    # T: O(m * n), S: O(m) Where m is no of strings and n is the avg length of a string