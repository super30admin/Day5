# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
# Find the Primeproduct of every elemnt in the given list
# Arrange the elements as per the primeProduct as a key (Hash set)
# return the list of lists
class Solution:
    def primehelper(self,item):
        primes = [ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        result = 1
        for st in item:
            result *= primes[ord(st) - ord('a')]
        return result
        
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict = {}
        for item in strs:
            primeProduct = self.primehelper(item)
            if primeProduct in dict:
                dict[primeProduct].append(item)
            else:
                dict[primeProduct] = [item]
                
        print(dict)
        return list(dict.values())