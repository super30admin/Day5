'''
====== Submission Details =======
Student Name: Pavan Kumar K. N.
S30 SlackID : RN32MAY2021
=================================
'''

#-------------  
# Explanation:
#-------------
# 205. Isomorphic Strings

# Given two strings s and t, determine if they are isomorphic.

# Two strings s and t are isomorphic if the characters in s can be replaced 
# to get t.

# All occurrences of a character must be replaced with another character while 
# preserving the order of characters. No two characters may map to the same 
# character, but a character may map to itself.


# Example 1:

# Input: s = "egg", t = "add"
# Output: true
# Example 2:

# Input: s = "foo", t = "bar"
# Output: false
# Example 3:

# Input: s = "paper", t = "title"
# Output: true

# Constraints:

# 1 <= s.length <= 5 * 10^4
# t.length == s.length
# s and t consist of any valid ascii character.

#-----------------
# Time Complexity: 
#-----------------
# O(N): Need to iterate over each char in two input str. 
# Case when isomorphic strings are input = O(N)
#------------------
# Space Complexity: 
#------------------
# O(1) - Using two arrays of fixed size = Constant

#-----------------------
# Leet Code Performance: 
#-----------------------
# Ran Successfully?: Yes
# Time             :  36 ms   (86.20 %ile)
# Space            :  14.4 MB (50.46 %ile)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        MAX_ASCII_CHARS = 256
        len_s = len(s)
        len_t = len(t)

        if len_s != len_t:
            return False

        # Array to store whether the item in string t was visited before
        visited_t = [False] * MAX_ASCII_CHARS

        # Maps the char in string s to a replacement character in string t
        map_st = [-1] * MAX_ASCII_CHARS

        # For each element in second string t
        for i in range(len_t):
            # If there is no prior mapping
            if map_st[ord(s[i])] == -1:
                
                #If the same character was already visited in string t
                if visited_t[ord(t[i])] == True:
                    # We cannot simply replace every character in s to get t
                    return False

                # Else, update the visited status of char in string t
                visited_t[ord(t[i])] = True

                # Add the mapping required to convert string s to t
                map_st[ord(s[i])] = t[i]

            # If there is already a mapping and it's some other character
            elif map_st[ord(s[i])] != t[i]:
                # We cannot replace every char in s to get t
                return False
        # If all the previous conditions passed, the string is isomorphic
        # Worst case: O(N)
        return True

