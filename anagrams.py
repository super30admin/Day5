# Time Complexity : O(nklogk)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_dict = {}

        for elem in strs:
            sorted_elem = ''.join(sorted(elem))
            if sorted_elem in anagram_dict:
                anagram_dict[sorted_elem].append(elem)
            else:
                anagram_dict[sorted_elem] = [elem]

        return anagram_dict.values()