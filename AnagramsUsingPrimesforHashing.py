
# // Time Complexity : O(N) 
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach


class Solution:
    def calculatePrimeProduct(self,s:str):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,61, 67, 71, 73, 79, 83, 89, 97,101,103]
        result = 1
        for i in range(0,len(s)):
            result = result * primes[ord(s[i])-ord('a')]
        return result
    
    def groupAnagrams(self,strs: List[str]) -> List[List[str]]:
        stringMap = dict()
        for i in range(0, len(strs)):
            primeProduct = self.calculatePrimeProduct(strs[i])
            if primeProduct not in stringMap.keys():
                stringMap[primeProduct] =[]
                stringMap[primeProduct].append(strs[i])
            else:
                stringMap[primeProduct].append(strs[i])
        return (list(stringMap.values()))