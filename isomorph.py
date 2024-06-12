"""
Given two strings s and t, determine if they are isomorphic. 
Two strings are isomorphic if the characters in s can be replaced to get t. 
All occurrences of a character must be replaced with another character 
while preserving the order of characters. No two characters may map to 
the same character but a character may map to itself.

Example 1: Input: s = "egg", t = "add" Output: true

Example 2: Input: s = "foo", t = "bar" Output: false

Example 3: Input: s = "paper", t = "title" Output: true Note:
 You may assume both s and t have the same length.

 create 2 dictionary

 check if dic stores 

 Time Complexity: On
 Space: On
"""
def isIsomorphic(self, s: str, t: str) -> bool:
        #corner case: because s and t are the same length, any string of 1 character is isomorphic
        if len(s) == 1:
            return True
        
        #Dictionary to map the characters from s with the characters of t
        charDict = {}
        
        #both arrays are the same size, with a ranged for loop we can consult both strings
        for i in range(0,len(s)):
            if s[i] not in charDict.keys():#Check first if the character is not there yet as a key
                if t[i] not in charDict.values():#It's important to check that before mapping a value, check if it has not yet been mapped
                    charDict[s[i]] = t[i]
                else:
                    return False #as the problem states, no two chars may map to the same character, therefore it is false
            else:
                if charDict[s[i]] != t[i]: #if the character is already mapped, but the char t[i] is not the same as the one already mapped, it is false
                    return False
        return True #after going through all the conditionals, we can confirm the string is isomorphic
		