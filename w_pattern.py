# The code defines a function to check if a string follows a specific pattern using a hashmap and a set.
# The function splits the input string 's' into words and checks if the number of words matches the length of the pattern string. If not, it returns False immediately.
# A dictionary 'd' is used to map characters from the 'pattern' to words in the list 'l'. A set 'se' is used to keep track of words that have already been mapped to ensure one-to-one correspondence.
# The function iterates through the pattern. If a character is already in the dictionary 'd', it checks whether the current word matches the word that the character maps to. If there's a mismatch, it returns False.
# If a character is not in the dictionary but the word is already in the set, it means another character has been mapped to this word, and it returns False.
# If neither condition is violated, the character and word are added to the dictionary and set, respectively.
# If the loop completes without returning False, the function returns True, indicating that the string 's' follows the given 'pattern'.
# Time Complexity (TC): 
#   - The function runs in O(n) time complexity, where n is the number of characters in the pattern or the number of words in 's', as there's a single loop iterating through the pattern.
# Space Complexity (SC): 
#   - The space complexity is also O(n) as the dictionary and set may store each character and word respectively at most once.


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        l = s.split(" ")
        if len(l)!=len(pattern):
            return False
        d ={}
        se=set()
        for i in range(len(pattern)):
            if pattern[i] in d:
                if d[pattern[i]]!=l[i]:
                    return False
            else:
                if l[i] not in se:
                    d[pattern[i]]=l[i]
                    se.add(l[i])
                else:
                    return False
        return True