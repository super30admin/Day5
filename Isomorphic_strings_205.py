# Time Complexity: O(n) since we are traversing the array once 
# Space Complexity: O(n) since we are creating 2 different dictionaries
# Code:
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_dict = {}
        t_dict = {}
        
        
        for i in range(len(s)):
            if s_dict.get(s[i]) == None:   # Check if current character is not present in the dictionary
                s_dict.update({s[i]:t[i]})
            else:
                if s_dict.get(s[i]) != t[i]: # If character already present in dictionary, then check if it has same value, if no then return False
                    return False
            if t_dict.get(t[i]) == None:  # Same logic as that of s
                t_dict.update({t[i]:s[i]})
            else:
                if t_dict.get(t[i]) != s[i]:
                    return False
        return True

# Approach: We create 2 dictionary one for mapping s->t and other for t->s. The reason why we create 2 dictionaries is because egh and add.
#           For s-> t : First we check if character is present in the dictionary, if not we add the chacter in the dictonary with corresponding t value
#           If already present, we check if the character is mapped with the same t value. If not, then we return False else we continue for other characters.
#           For t -> s : we follow the same approach. In the end , if every character is parsed then we return True value