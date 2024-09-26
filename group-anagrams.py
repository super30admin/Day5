# Approach:
# 1. We initialize a defaultdict 'res' to store lists of anagrams.
# 2. For each string in 'strs', we create a list 'char' of size 26, 
#    representing the frequency of each letter in the string.
# 3. We use this list (converted to a tuple) as a key in 'res', 
#    and append the original string to the corresponding list.
# 4. Finally, we return all the grouped anagrams by returning the values of 'res'.

# Time Complexity:
# - Overall time complexity is O(N * L), where N is the number of strings and L is the average length of strings.

# Space Complexity:
# - Storing the frequency list for each string takes O(N * L).
# - 'res' holds all the grouped anagrams, which also takes O(N * L) space.
# - So, the overall space complexity is O(N * L).

from collections import defaultdict

class Solution(object):
    def groupAnagrams(self, strs):
        res = defaultdict(list)

        for s in strs:
            char = [0] * 26

            for c in s:
                char[ord(c) - ord("a")] += 1

            res[tuple(char)].append(s)
        
        return res.values()
