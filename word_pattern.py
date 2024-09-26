#Time Complexity: O(n) where n is the number of characters in pattern
#Space Complexity: O(n) where n is the number of characters in pattern
#Approach: Check if the index occurence of each character in the pattern matches with the word occurence of each word in str
class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        splitted = str.split(" ")
        return tuple(map(pattern.find, pattern)) == tuple(map(splitted.index, splitted))