#Time Complexity : 
'''
Problem 1 - O(n*k) generating the prime nos. for the corresponding characters
Problem 2 - O(n) as we parse through all the data
Problem 3 - O(n) as we parse through all the data
'''
#Space Complexity : 
'''
Problem 1 - O(1) as we lookup each time 
Problem 2 - O(1) as space is not increasing linearly and has constant space
Problem 3 - O(1) as space is not increasing linearly and has constant space
'''
#Did this code successfully run on Leetcode :
'''Yes the code submission ran successfully'''
#Any problem you faced while coding this :
'''
Problem 1 : Is there a way i can replace the for loop at the end by appending keys of the hashmap
directly in the list ?.
Problem 2 : Solution 2 is not working when i convert the hashmaps to char strings. Please help !
'''
## Problem 1: Given an array of strings, group anagrams together.
# Generate a prime product for all character combinations. Even if the characters are interchanged the
# product remains the same.
# Initialize a hashmap and store all the combinations that match the product.
# Return the result strings in the form of array else it will be an empty string.
class Solution(object):
    # Create a function that will generate an unique number for each character and get the
    # the product of these prime numbers.
    def prime_product(self, prime_nos, string):
        product = 1
        for character in string:
            product *= prime_nos[ord(character) - ord('a')]
        return product

    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        # We initialize a boiler plate array of prime nos for 26 chars
        prime_nos = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
                     89, 97, 101, 103]
        # Initialize a hashmap that will store all combinations of anagrams
        anagram_groups = {}
        result_strings = []
        for strings in strs:
            prim_product = self.prime_product(prime_nos,strings)
            if prim_product not in anagram_groups:
                anagram_groups[prim_product] = [strings]
            else:
                anagram_groups[prim_product].append(strings)
        for key in anagram_groups:
            result_strings.append(anagram_groups[key])
        return result_strings

## Problem 2: Isomorphic strings
# For the given strings we have to check whether the characters of first string if replaced by 
# character from the second are exactly identical.
# We will initialize two hashmaps. store the first string array character as key and character
# of second string array as value.
# If the character does not exist we append, else we will check if it has a different character stored
# and return False. If everything matches we return True.
'''Solution 1'''
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        s_len = len(s)
        t_len = len(t)
        if s_len != t_len: return False
        # Initialize two hashmaps (dictionary in Python)
        hash_map_1 = {} 
        hash_map_2 = {}
        for i in range(0,s_len - 1):
            s_character = s[i] # Take first character of first string array
            t_character = t[i] # Take first character of second string array
            # Check if character of first string exists hashmap 1 
            if s_character not in hash_map_1: 
            # If value does not exist for the key, then insert
                hash_map_1[s_character] = t_character
            else:
            # If character of first string (key) already exists in hashmap 1
            # and the value is not the same we return "False"    
                if hash_map_1[s_character] != t_character:
                    return False
            # Check if character of second string exists hashmap 2     
            if t_character not in hash_map_2:
            # If value does not exist for the key, then insert     
                hash_map_2[t_character] = s_character
            else:
            # If character of second string (key) already exists in hashmap 2
            # and the value is not the same we return "False"   
                if hash_map_2[t_character] != s_character:
                    return False
            # If we reach at the end that means the key, value pairs in both hashmaps matched
            # Both the strings are Isomorphic - return "True"
        return True   
'''Solution 2'''        
'''class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        s_len = len(s)
        t_len = len(t)
        if s_len != t_len: return False
        sChar = [""]
        tChar = [""]
        for i in range(s_len):
            s_character = s[i]
            t_character = t[i]
            if sChar[s_character - " "] == "": 
                sChar[s_character] = t_character
            else:
                if sChar[s_character - " "] != t_character:
                    return False
            if tChar[t_character - " "] == "": 
                tChar[t_character] = s_character
            else:
                if tChar[t_character - " "] != s_character:
                    return False
        return True'''
## Problem 3: Given a pattern and a string str, find if str follows the same pattern.
# For the given pattern string we have to check whether the characters of first string if replaced by 
# words is exactly identical.
# We will initialize two hashmaps. store the first string array character as key and word
# of second string array as value.
# If the word does not exist we append, else we will check if the character has a different word 
# stored we return False. If everything matches we return True.
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        strings = s.split() # Split every character of the string to assign it a word
        if len(pattern) != len(strings): 
            return False
        pattern_map = {} # Create two hash maps
        string_map = {}
        for i in range(len(pattern)):
            if pattern[i] not in pattern_map:
                pattern_map[pattern[i]] = strings[i]
            else:
                if pattern_map[pattern[i]] != strings[i]:
                    return False
            if strings[i] not in string_map:
                string_map[strings[i]] = pattern[i]
            else:
                if string_map[strings[i]] != pattern[i]:
                    return False
        return True  
        


