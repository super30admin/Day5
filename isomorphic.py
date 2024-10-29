# The code defines a function to determine if two strings, 's' and 't', are isomorphic.
# Two strings are isomorphic if the characters in 's' can be replaced to get 't', maintaining a consistent character mapping throughout the strings.
# The function uses two dictionaries, 'char_index_s' and 'char_index_t', to store the first occurrence indexes of characters from both strings, respectively.
# As the function iterates through both strings simultaneously, it checks:
#   - If a character from 's' or 't' has not been seen before, it records the index of that character in the respective dictionary.
#   - It then compares the recorded indexes for the current characters in both strings. If they differ, it means the characters do not consistently map to each other, and the function returns False.
# If all character comparisons are consistent throughout the loop, the function concludes that the strings are isomorphic and returns True.
# Time Complexity (TC): 
#   - The function operates in O(n) time complexity, where n is the length of string 's' (assumed equal to 't'), as it requires a single pass through the strings.
# Space Complexity (SC): 
#   - The space complexity is O(1) in terms of extra space used, not counting the input and output. This is because the size of the character set is constant (assuming ASCII or Unicode), thus the dictionaries will have a limited number of possible keys.


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        char_index_s = {}
        char_index_t = {}

        for i in range(len(s)):
            if s[i] not in char_index_s:
                char_index_s[s[i]] = i

            if t[i] not in char_index_t:
                char_index_t[t[i]] = i
            
            if char_index_s[s[i]] != char_index_t[t[i]]:
                return False

        return True