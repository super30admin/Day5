# Time Complexity : O(N*len(longest word))
# Space Complexity : O(N)

# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO

# Your code here along with comments explaining your approach

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        buckets = {}
        for word in strs:
            key = [0] * 26
            for ch in word:
                key[ord(ch) - ord('a')] += 1
            key = tuple(key)
            if key in buckets:
                buckets[key].append(word)
            else:
                buckets[key] = [word]
        
        return list(buckets.values())