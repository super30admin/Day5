# Time Complexity : O(n*k) [n = number stings in the input list, k = average length of strings in the input list] 
# Space Complexity : O(1)
# 
# Did this code successfully run on Leetcode : Yes
# 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach 
class Solution:
    def getPrimeEquivalent(self, s):
        """
        Function to generate unique hashcode for a string(all lowercase alphabets)
        The hashcode is same for anagrams
        """
        primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,59,61,67,71,73,79,83,97,101,103,107]
        res = 1
        for curr in s:
            res*=primes[ord(curr)-ord('a')]
        return res
    def groupAnagrams(self, strs):
        if not strs: return []
        res = collections.defaultdict(list) # this initialises a map with empty list for each key
        for word in strs:
            hashcode = self.getPrimeEquivalent(word)
            res[hashcode].append(word)
        return res.values()