'''
Time Complexity: O(n*m) where m is avg length of the string and n is length of the list
Space Complexity: O(n) where n is length of list of strings
Run on Leetcode: YES
'''
class Solution:
    def getKey(self, s) -> int:
        prime_list = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        res = 1
        for index in range(len(s)):
            res *= prime_list[ord(s[index]) - ord('a')]
        return res
            
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        aMap = {}
        for string in strs:
            key = self.getKey(string)
            if not key in aMap.keys():
                aMap[key] = []
            aMap[key].append(string)
        return list(aMap.values())