# APPROACH - 1  - MY APPROACH (BEFORE CLASS) 
# Time Complexity : get_hash() - O(k) where k is the length of the longest word. groupAnagrams - O(nk) where n is the total number of words. 
# Space Complexity : O(n) - keys of the dict are of constant length - 26. It's O(n), what if each of the words in the list are unique anagrams. (I THINK IT SHOULD BE O(nk) 
# as n words to be added to hashmap each having avaerage length of k.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
# Your code here along with comments explaining your approach
# 1. Build a dict - anagrams where key is the hash value of the anagram and value is the list of words having same hash value as the key
# 2. get_hash() computes the hash value of a word - initialize an array of 0's of length 26 and increement the count of letters as you see them in the word. 
#                                                 - convert to a string as lists can't be used as keys in a dict as they are immutable data structure. 
# 3. Go through each word and get its hash value -> compare with the keys of the dict and add it to list where it matches (if the key exists) or create a new entry.
# 4. ord function returns the unicode value of the char in Python


class Solution:
    def get_hash(self, word):
        hash_code = [0] * 26
        for char in word:
            hash_code[ord(char) - ord('a')] += 1
        return ' '.join([str(elem) for elem in hash_code]) 
    
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        if not strs:
            return None
        
        anagram = {}
        for word in strs:
            word_hash = self.get_hash(word)
            if word_hash in anagram:
                anagram[word_hash].append(word)
            else:
                anagram[word_hash] = [word]
                
        return anagram.values()
            
        

# APPROACH - 2  - INTERMEDIATE SOLUTION 
# Time Complexity : O(n k log k) where n is the total number of words and k is the length of the longest word. 
# Space Complexity : O(nk) - keys of the dict are of length k (bounded by max length). It's O(n), what if each of the words in the list are unique anagrams. 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :tried to use set() as key but they are mutable in Python.
#
# Your code here along with comments explaining your approach
# 1. Build a dict - anagrams where key is the sorted version of word and value is the list of words having same sorted version as the key
# 2. Go through each word and get it sorted -> compare with the keys of the dict and add it to list where it matches (if the key exists) or create a new entry.
# 3. Return the values of the dict
# 4. IMPROVEMENT: Instead of sorting the same string thrice, just store the sorted string. 

class Solution:
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        if not strs:
            return None
   
        anagram = {}
        for word in strs:
            if tuple(sorted(word)) in anagram:
                anagram[tuple(sorted(word))].append(word)
            else:
                anagram[tuple(sorted(word))] = [word]
                
        return anagram.values()
        

# APPROACH - 3 - PRIME NUMBERS
# Time Complexity : groupAnagrams - O(nk) where n is the total number of words and k is the length of the longest word. 
# Space Complexity : O(n) - keys of the dict are of constant length - 26. It's O(n), what if each of the words in the list are unique anagrams. (I THINK IT SHOULD BE O(nk) 
# as n words to be added to hashmap each having avaerage length of k.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
# Your code here along with comments explaining your approach
# 1. Same as APPROACH 1. ONLY DIFFERENCE IS IN HASH VALUE. Each letter is assigned a prime number
# 2. Hash values of word is the product of the prime values of each of it's characters.
# 3. No collision will happen with a word that is not anagram.


class Solution:
    
    def __init__(self):
        self.prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
    
    def get_prime(self, word):
        result = 1
        for char in word:
            result *= self.prime[ord(char) - ord('a')]
        return result
        
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        if not strs:
            return None
   
        anagram = {}
        for word in strs:
            prime_word = self.get_prime(word)
            if prime_word in anagram:
                anagram[prime_word].append(word)
            else:
                anagram[prime_word] = [word]
                
        return anagram.values()
                
        
