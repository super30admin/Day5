#Time Complexity - O(n)
#Space Complexity - O(k)
#Successfully compiled and run on Leetcode

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hashmapP = {}
        hashmapS = {}

        words = s.split(' ') #generate list from str s
        if len(words) != len(pattern): #if the lengths of strs are not same, no point in checking match
            return False

        for char, word in zip(pattern, words): #zip fn to process elements from both pattern and s at once

            if (char not in hashmapP):# if char from pattern is not present in Pattern - hashmap
                if (word in hashmapS): #first we check if corresponding val already in Hashmap - S , then there's no uniqueness
                    return False
                else:
                    hashmapP[char] = word # if corresponding val of key isnt there, simply add new key-val to both hashmaps
                    hashmapS[word] = char
            else: # if char from pattern is present in Pattern - hashmap
                if ((hashmapP[char] != word)): #just check if 2 keys are pointing to same val in Pattern-hashmap
                    return False

        return True

