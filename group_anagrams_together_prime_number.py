'''
Given an array of strings, group anagrams together.

Time complexity: O(nk)
Space complexity: O(n), n = space for one dictionary
Implementation: Create a dictionary with key as product of prime numbers assigned to each character and value as an array conatining the words with the letters
letter_dict = {
  426: ["bat"]
  1562: ["ate", "eat", "tea"],
  6106: ["nat", "tan"],
}
'''
class Solution:
    def getPrimeNumber(self, s):
      prime_numbers = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
      mult = 1
      for x in range(len(s)):
        ch = s[x]
        mult = mult * prime_numbers[ord(ch) - ord('a')]
      return mult
      
    def groupAnagramsTogether(self, inputArray):
        d1 = {}
        for i in range(len(inputArray)):
          mult = self.getPrimeNumber(inputArray[i])
          print(mult)
          d1[mult] = d1.get(mult, []) + [inputArray[i]]
        return d1
        
s = Solution()
strs = ["eat","tea","tan","ate","nat","bat"]
# strs = [""]
# strs = ["a"]
print(s.groupAnagramsTogether(strs))       