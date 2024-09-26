# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# We will append the indexes of occurences of letters in both the strings to d1 and d2 respectively.
# We will compare if the values of these occurences in sorted order are same to check if the strings are isomorhpic.
from collections import defaultdict
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d1=defaultdict(list)
        d2=defaultdict(list)
        for i in range(len(s)):
            d1[s[i]].append(i)
        for i in range(len(t)):
            d2[t[i]].append(i)
        
        return sorted(d1.values())==sorted(d2.values())
            