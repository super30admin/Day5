# Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
""" If we sort each string first and group the same strings, then time complexity would be m*nlog(n) where m is the
number of strings and n is the average length of the string. But if we use a count array, then the time complexity
will be O(m*n) where m is the number of strings and n is the average length of the string as we have to go through each
string to count how many characters it has. We're using only a count array """
from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs):
        result = defaultdict(list)  # Mapping character count to list of anagrams

        for word in strs:
            # Create a count array for every string to get the character counts
            count = [0] * 26

            for ch in word:
                count[ord(ch) - ord("a")] += 1

            # Store the string as value and the tuple of count of that string as key
            result[tuple(count)].append(word)

        return result.values()