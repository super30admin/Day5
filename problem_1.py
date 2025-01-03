#  Time Complexity : O(n)
#  Space Complexity : O(n)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

#  https://leetcode.com/problems/group-anagrams/description/
#  Your code here along with comments explaining your approach 
#  I created a dictionary where the key is the sorted string and the value is the list of strings 
#  that are anagrams of the key.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = {}

        for s in strs:
            temp = ''.join(sorted(s))
            if temp in d:
                d[temp].append(s)
            else:
                d[temp]  = [s]
        
        return list(d.values())