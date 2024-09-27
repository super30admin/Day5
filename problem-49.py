class Solution(object):
    
    def __init__(self):
        
        self.primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
        
        self.hash = {}
        
    def prime_associates(self, char):
        result = 1
        for i in range(len(char)):
            result = result + self.primes[ord(char[i])-ord('a')]
        return result
    
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        resultant = []
        for i in range(len(strs)):
            key = self.prime_associates(strs[i])
            try:
                if(self.hash[key]):
                    self.hash[key].append(strs[i])
            except:
                    
                self.hash[key] = []
                self.hash[key].append(strs[i])
                
                
        for i in self.hash.values():
            resultant.append(i)
        return resultant



sol = Solution()
strs = ["eat","tea","tan","ate","nat","bat"]
print(sol.groupAnagrams(strs))

