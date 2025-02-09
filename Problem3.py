# Problem 3 -  Word Pattern
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Explain your approach in **three sentences only** at top of your code :
'''
In this approach, we use a hashmap to store the pattern, with the character from the pattern as the key and the corresponding string 
as the value. We use a set to store the individual strings. When checking the hashmap, if the key is not found, we then verify if 
the value associated with that key exists in the set.
'''

# Your code here along with comments explaining your approach

# Using 1 hashmap and 1 hash set
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # Splitting the str into array list
        charArray = s.split(" ")
        lengthcharArray = len(charArray)
        lengthPattern = len(pattern)
        if (lengthcharArray != lengthPattern):
            return False
        # Create hashmap for pattern and set for character array
        hashmapP = {}
        setS = set()
        for i in range(lengthcharArray):
            # Get the current character of pattern and string from character array
            charS = charArray[i]
            charP = pattern[i]
            # Checking if the character of pattern is in hashmap
            if (charP in hashmapP):
                # if key is present then check the value with the current string. Return False if the value is not equal
                if (hashmapP[charP] != charS):
                    return False
            # If the key is not present
            else:
                # check if the string present in the set and is it is present then return False
                if (charS in setS):
                    return False
                # if not present in the set then add in hash map and set the
                else:
                    hashmapP[charP] = charS
                    setS.add(charS) 

        return True