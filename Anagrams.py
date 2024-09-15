#Time Complexity: O(nk) n being size of strs and k being average word length
#Space Complexity: O(n)
#Successfully ran on leetcode

class Solution:
    def groupAnagrams(self, strs: list(str)) -> list(list(str)):
        d = {}
        result = []
        for i in strs:
            h = self.hashCode(i)
            if h not in d:
                d[h] = [i]
            else:
                d[h].append(i)
        for i in d:
            result.append(d[i])
        return result
      
    def hashCode(self,s:str) -> int:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        l=1
        for i in s:
            l*=primes[(ord(i)-ord('a'))]
        return l