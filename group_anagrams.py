from collections import defaultdict


class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """

        def get_hash(str):
            hash_val = 1.0
            prime_nums = [
                2,
                3,
                5,
                7,
                11,
                13,
                17,
                19,
                23,
                29,
                31,
                37,
                41,
                43,
                47,
                53,
                59,
                61,
                67,
                71,
                73,
                79,
                83,
                89,
                97,
            ]
            for s in str.lower():
                hash_val = hash_val * prime_nums[ord(s) - ord("a")]
            return hash_val

        result = [[]]
        if len(strs) == 0 or strs is None:
            return result
        map = defaultdict(list)
        for str in strs:
            hash_val = get_hash(str)
            map[hash_val].append(str)
        return list(map.values())


# time complexity is O(N*K) where N is the number of strings in the input strs
# space complexity is O(N*K) where N is the number of strings in the input strs
