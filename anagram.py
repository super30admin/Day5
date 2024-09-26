"""
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

All inputs will be in lowercase.

Constraints:


1 <= strs.length <= 10^4
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.

"""

# Time Complexity : O(n*k) where n is total length of list and k is average length of each string
# Space Complexity : O(n*k) (as we might need whole hashmap in worst case)
# Did this code successfully run on VSCode : Yes
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        # Using hashmap approach
       # Sorting each word in the list and the sorted list becomes the key. Values will be the strings in the list
       # Initiating a dictionary to store key and values
        anagram = {}
        
        # Constraints
        if len(strs) >= 1 and len(strs) <= 100:
            # iterating over each string
            for i in strs:

                # First sorting string in the list in alphabetical order. If 2 strings are anagrams, the key will the same for both
                sorted_list = "".join(sorted(i))

                # Constraints
                if len(i) >= 1 and len(i) <= 10000 and i.islower() is True:
                    # Once sorted key is found, compare it with the strings. If not matched, put in an empty list, else append to existing list
                    if sorted_list not in anagram:

                        anagram[sorted_list] = [i]

                    anagram[sorted_list].append(i)
                
                # Constraints
                else:
                    print("Please make sure each string is greater than 0, less than 105 characters, and contains all lower case characters and try again!")
                    return ("")

        # Constraints    
        else:
            print("Please ensure the total length of string characters does not exceed 100 or go below 1 and try again!")
            return ("")
        
        #returning the value portion of the dictionary
        return list(anagram.values())

s = Solution()
result = s.groupAnagrams(["shirin", "rinshi", "inrshi", "iinrsh", "good", "oodg"])
print(result)




