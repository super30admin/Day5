'''
    Time Complexity:
        O(n * klog(k)) (where, n = length of input list, k = max length of a word)

    Space Complexity:
        O(n*k) (where, n = length of input list, k = max length of a word)
        Because for each word of length k, I am creating a sorted version of that word

    Did this code successfully run on LeetCode?:
        Yes

    Problems faced while coding this:
        None

    Approach:
        Create a sorted copy of each word and add the original word to the list
        associated to this sorted copy. This way, "tea" and "eat" will be added
        to the list associated with "aet".
        Return the values of this HashMap.
'''

import collections

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = collections.defaultdict(list)

        for word in strs:
            sorted_word = ''.join(sorted(word))
            anagrams[sorted_word].append(word)

        return anagrams.values()
