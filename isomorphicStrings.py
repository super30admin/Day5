# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Handling the edge case s = 'ab' and t = 'aa'

# Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t. All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

# Example 1: Input: s = "egg", t = "add" Output: true
# Example 2: Input: s = "foo", t = "bar" Output: false
# Example 3: Input: s = "paper", t = "title" Output: true Note: You may assume both s and t have the same length.

class Solution(object):
    def isomorphicStrings(self, s, t):
        """
        create a hashmap to store isomorphic values of characters
        check len of s and len of t and len of set of s and len of set of t
        iterate through all the characters and store their corresponding value in the hashmap if it does not exist
        while iterating, if we find that key again, verify the value in hashmap is equal to the current value of t
        """

        if len(s) != len(t):
            return False

        if len(set(s)) != len(set(t)):
            return False    
        
        lookup = {}
        for i in range(len(s)):
            if s[i] not in lookup:
                lookup[s[i]] = t[i]
            else:
                if lookup[s[i]] != t[i]:
                    return False
        return True

obj = Solution()
s, t = 'egg', 'add' 
print(obj.isomorphicStrings(s,t))
s, t = 'foo', 'bar' 
print(obj.isomorphicStrings(s,t))
s, t = 'paper', 'title' 
print(obj.isomorphicStrings(s,t))