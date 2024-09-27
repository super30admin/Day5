#Time Complexity - O(nk) where n is number of string and k is length of each string
#Space Complexity - O(n)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        primeList = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        dict = {}
        for x in strs:
            value = self.getPrime(x, primeList)
            if value not in dict:
                dict[value] = []
            dict[value].append(x)
        return dict.values()
    
    def getPrime(self, string, primeList):
        mul = 1
        for x in string:
            mul *= primeList[ord(x) - ord('a')]
        return mul