#Time Complexity - O(n)
#Space Complexity - O(k)
#Successfully compiled and run on Leetcode

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashmapS = {} # taking 2 hashmaps for 2 different strings
        hashmapT = {}

        for char1, char2 in zip(s, t): #zip fn to process elements from both strings s and t at once

            if ((char1 not in hashmapS) and (char2 not in hashmapT)): #if keys dont exist, insert keys and its values
                hashmapS[char1] = char2
                hashmapT[char2] = char1
            else: #if key already present
                if (hashmapS.get(char1) != char2 or hashmapT.get(char2) != char1): #verify if the mutual values are present
                    return False #if not then there is no match in strings s & t
        return True