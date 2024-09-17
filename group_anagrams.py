# Did this code successfully run on Leetcode : YES


# APPROACH

# use prime numbers, with mapping to each char, product of them would be same for anagrams -> eliminated need to sort

# TC : O(nk)
# SC : O(nk)




class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mapping = {}
        primes = {'a': 2, 
                  'b': 3, 
                  'c': 5, 
                  'd': 7, 
                  'e': 11, 
                  'f': 13,
                  'g': 17,
                  'h': 19,
                  'i': 23,
                  'j': 29,
                  'k': 31,
                  'l': 37,
                  'm': 41,
                  'n': 43,
                  'o': 47,
                  'p': 53,
                  'q': 59,
                  'r': 61,
                  's': 67, 
                  't': 71,
                  'u': 73,
                  'v': 79,
                  'w': 83,
                  'x': 89,
                  'y': 97,
                  'z': 101
                 }
        for word in strs:
            x = 1
            for letter in word:
                x *= primes[letter]
            # print(x)
            if x in mapping:
                mapping[x].append(word)
            else:
                mapping[x] = [word]
        return list(mapping.values())








# TC: O(n k log k) where n is number of words and k is the average length of each word
# SC: O(n*k) to store all words

# APPROACH
# hashmap to keep track of mappings
# key is the sorted version of a word: eat, tea, ate -> all will get sorted to aet
# value is a list consisting of anagrams of the key
# in the end, return a list of all values of the mapping

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mapping = {}
        for word in strs:
            x = ''.join(sorted(word))
            print(x)
            if x in mapping:
                mapping[x].append(word)
            else:
                mapping[x] = [word]
        return list(mapping.values())