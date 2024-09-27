'''
Given an array of strings, group anagrams together.

Time complexity: O(n*mlogm), n = number of words, mlogm = for sorting m words
Space complexity: O(n), n = space for one dictionary
Implementation: Create a dictionary with key as sorted letters in a word and value as an array conatining the words with the letters
letter_dict = {
  (a,b,t): ["bat"]
  (a,e,t): ["ate", "eat", "tea"],
  (a,n,t): ["nat", "tan"],
}
'''
class Solution:
    def groupAnagramsTogether(self, inputArray):
        letter_dict = {}
        for word in inputArray:
            key = tuple(sorted(word)) # can use only immutable type as key (e.g. string, tuple) 
            letter_dict[key] = letter_dict.get(key, []) + [word] # handles when key does not have value => set to []
        return list(letter_dict.values())
            
s = Solution()
strs = ["eat","tea","tan","ate","nat","bat"]
# strs = [""]
# strs = ["a"]
print(s.groupAnagramsTogether(strs))       