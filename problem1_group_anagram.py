# Time Complexity : N : number of words , M : lenth of word : O(N* MlogM)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}
        for word in strs:
            sorted_word = sorted(word)

            sorted_word = "".join(sorted_word)
            if sorted_word in map:
                map[sorted_word].append(word)
            else:
                map[sorted_word] = [word]
        return map.values()
