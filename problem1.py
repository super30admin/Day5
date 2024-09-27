# Time Complexity : O(NK ), where K is size of string average
# Space Complexity : 0(1)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach

# using primary number as product of primary is always unique
class Solution:
    def __init__(self):
        self.primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,61, 67, 71, 73, 79, 83, 89, 97, 101]

    def calculatehash(self,str):
        result = 1
        for each in str:
            result = result*self.primes[ord(each) - ord('a')]
        return result    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:   
        sol = []
        hashvalue = {}
        if strs is None:
            return None
        for each in strs:
            if each == None:
                continue
            hash = self.calculatehash(each)
            if hash in hashvalue:
                hashvalue[hash].append(each)
            else:
                hashvalue[hash] = [each]
                
        for k,v in hashvalue.items():
            sol.append(v)
        return sol