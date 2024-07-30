#Approach 1: Using hasmap and hashset
# TC:O(n)
# SC:O(n)
# for detailed explaination refer word_pattern.py
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        maps={}
        set_vals=set()

        for i in range(len(s)):
            if s[i] in maps:
                if maps[s[i]]!=t[i]:
                    return False
            else:
                if t[i] in set_vals:
                    return False
                maps[s[i]]=t[i]
                set_vals.add(t[i])
        return True

# Approach 2: Using two hashmap
# One test case is not passed with this foo bar

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) !=len(t):
            return False
        
        char_to_char1={}
        char1_to_char={}

        for i in range(len(s)):
            char=s[i]
            word=t[i]

            if char in char_to_char1:
                if char_to_char1[char]!=word:
                    
                    return False
                else:
                    char_to_char1[char]=word
            
            if word in char1_to_char:
                if char1_to_char[word]!=char:
                    
                    return False
                else:
                    char1_to_char[word]=char

        return True