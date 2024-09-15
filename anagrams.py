# Time Complexity : O(Nk) where N is the length of input array as we iterate over it, and k is the average length of each string we process to get the prime product
# Space Complexity : O(N) space required for the the group dictionary
# 49. Group Anagrams

class Solution:
    def groupAnagrams(self, strs):
        # Base case
        if len(strs) <= 1:
            return [strs]
        groupsdict = {}
        for s in strs:
            product = self.getPrimeProduct(s)
            if product not in groupsdict:
                groupsdict[product] = []
            groupsdict[product].append(s)
        return [v for k,v in groupsdict.items()]
        
        
    def getPrimeProduct(self, s):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        primeProduct = 1
        for ch in s:
            primeProduct *=  primes[(ord(ch) - ord('a'))]
        return primeProduct

o = Solution()
s = ["eat","tea","tan","ate","nat","bat"]
print(o.groupAnagrams(s))