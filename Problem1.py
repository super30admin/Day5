"""Group anagrams :
Time complexity : O(nk)
Space Complexity: O(nk) n - number of words, k - length of words


Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this :No
"""
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        """Use the unique property of prime numbers for keys - product of 2 prime numbers is unique."""
        prime = [ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,103]
        anagram_dict = {}
        #for each word in strs
        for word in strs:
            result = 1
            # for each character in word calculate key
            for c in word:
                result = result*prime[ord(c)-ord('a')]
                #check if key in dict
            if(result not in anagram_dict.keys()):
                anagram_dict[result] = [word]
            else:
                #if key already in dict append word to list
                anagram_dict[result].append(word)
                
        return(list(anagram_dict.values()))