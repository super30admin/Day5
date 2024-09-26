# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No problem because it was very similar to isomorphic strings

# Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

# Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true
# Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false
# Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false
# Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false 
# Notes: You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

class Solution(object):
    def wordPattern(self, pattern, strings):
        """
        Split the strings and store them in a list
        create a hashmap to store character of pattern and corresponding string
        check len of s and len of t and len of set of s and len of set of t
        iterate through all the characters and store their corresponding value in the hashmap if it does not exist
        while iterating, if we find that key again, verify the value in hashmap is equal to the current value of list string
        """
        list_str = strings.split(' ')
        if len(pattern) != len(list_str):
            return False
        
        if len(set(pattern)) != len(set(list_str)):
            return False
        
        lookup = {}
        for i in range(len(pattern)):
            if pattern[i] not in lookup:
                lookup[pattern[i]] = list_str[i]
            else:
                if lookup[pattern[i]] != list_str[i]:
                    return False
        return True

obj = Solution()
pattern , string =  "abba", "dog cat cat dog"
print(obj.wordPattern(pattern, string))

pattern , string =  "abba", "dog cat cat fish"
print(obj.wordPattern(pattern, string))

pattern , string =  "aaaa", "dog cat cat dog"
print(obj.wordPattern(pattern, string))

pattern , string =  "abba", "dog dog dog dog"
print(obj.wordPattern(pattern, string))