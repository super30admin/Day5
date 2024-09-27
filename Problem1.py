# Time Complexity: O(nk) -- where n is the length of the array and k is average length of strings in the array
# Space Complexity: O(1)

class Solution:
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        s = {}
        for i in range(len(strs)):
            temp = self.calculateprimeprod(strs[i])
            if temp not in s.keys():
                s[temp] = []
            s[temp].append(strs[i])
        return s.values()
    
    def calculateprimeprod(self,string):
        primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]
        product = 1
        for i in range(len(string)):
            char = string[i]
            product = product*primes[ord(char)-ord('a')]
        return product
