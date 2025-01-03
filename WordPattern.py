# Time Complexity : O(nk), where n is the number of strings/words in the given string s and k is the average length of these strings
# Space Complexity : O(n), where n is the number of strings/words in the given string s
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA 

# Your code here along with comments explaining your approach:
# - using two hash maps to solve this problem, patternMap contains the mapping of characters in given pattern to words in the given string s
# - stringMap contains the mapping of words in the given string s to characters in pattern
# - first, I have split the s string into words, str
# - next, I am checking if every character in pattern is present as a key in patternMap or not
# - if not, we are adding this mapping to the word at that index in the str string
# - if the key is present we check, if its is correctly mapped to the expected value of str[i]
# - if not, we return false
# - similarly, checking the mapping of str - > pattern in strMap

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        patternMap = {}
        stringMap = {}
        # splitting the strings in the given string s
        str = s.split(" ")

        if (len(pattern) != len(str)):
            return False

        for i in range(len(pattern)):
            # checking in patternMap
            if pattern[i] in patternMap:
                # key already exists in the map
                # checking if value is as expected
                if patternMap[pattern[i]] != str[i]:
                    # value is not correctly mapped
                    return False

            else:
                # key does not exist already
                # so we will add it
                patternMap[pattern[i]] = str[i]

            # checking in stringMap
            if str[i] in stringMap:
                # key exists in stringMap
                if stringMap[str[i]] != pattern[i]:
                    # value is not corectly mapped
                    return False

            else:
                # key does not exist
                # so we will add it
                stringMap[str[i]] = pattern[i]
        
        return True


        