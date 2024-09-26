# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# We will split the string at emptyspaces are and put them into a list.
# We create a dictionary where the keys are the letters of words in sorted order which will ensure that anagrams
# are appended to the same key.

from collections import defaultdict
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words=s.split(' ')
        d1=defaultdict(list)
        d2=defaultdict(list)
        for i in range(len(pattern)):
            d1[pattern[i]].append(i)
        for i in range(len(words)):
            d2[words[i]].append(i)
        
        return sorted(d1.values())==sorted(d2.values())
            