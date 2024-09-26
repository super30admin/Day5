"""
Leetcode- https://leetcode.com/problems/group-anagrams/
TC- O(w * N) - prime product approach, SC- O(N) - hashmap
Challenge-
Lecture- https://youtu.be/2riNDAD4GgM
FAQ-
Why prime product - because prime product is unique for strings where it's character order don't matter.
Where do you get list of primes? - Ask interview to use it from your saved notes

Given an array of strings strs, group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

Constraints:
1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
"""


'''
Idea1 O(N*WlogW + N)- Hashmap - record sorted words in hashmap, sort the word in str[] and check against hashmap if exists.

Idea2 O(w * N)- Prime number and Hashmap - assign each alphabet with unique prime number, 
the product will be same for string where order of characters is not considered. Store prime product in hashmap,
and append strings as it's values.
'''
class Solution:
    # TC - O(N*WlogW + N) where w = length of words, SC- O(N)
    def groupAnagrams1(self, strs):
        dictAnagrams = {}
        for str_ in strs:
            sortedStr = ''.join(sorted(str_))
            if sortedStr not in dictAnagrams:
                dictAnagrams[sortedStr] = [str_]
            else:
                dictAnagrams[sortedStr].append(str_)

        # return anagrams as grouped list
        return dictAnagrams.values()

        # TC - O(w * N) where w = length of words, SC- O(N)
    def groupAnagrams(self, strs):
        dictAnagrams = {}
        primeList = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        for str_ in strs:
            # prime product of string
            str_pp = 1
            for char_ in str_:
                ind_ = ord(char_) - 97
                str_pp *= primeList[ind_]

            if str_pp not in dictAnagrams:
                dictAnagrams[str_pp] = [str_]
            else:
                dictAnagrams[str_pp].append(str_)

        # return anagrams as grouped list
        return dictAnagrams.values()

