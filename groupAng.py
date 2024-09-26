"""
time complexity: O(n)
space complexity: O(1)
"""
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ana = {}
        for i in range(0,len(strs)):
            if(self.primeNum(strs[i]) not in ana):
                ana[self.primeNum(strs[i])] = []
            ana[self.primeNum(strs[i])].append(strs[i])
            
        return ana.values()
    def primeNum(self,string):
        primeNums = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        
        sums=1
        
        for i in range(len(string)):
            sums*=primeNums[ord(string[i])-ord('a')]
        return sums
        
        
        