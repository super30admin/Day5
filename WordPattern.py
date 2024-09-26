Word Pattern:
'''
Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:

Input: pattern = "abba", str = "dog cat cat dog"
Output: true

Example 2:

Input:pattern = "abba", str = "dog cat cat fish"
Output: false
'''
time: O(n) 
space: O(n) 

class Solution(object):
    def wordPattern(self, pattern, str):
        
        str_list = str.split() ## This takes O(n) time to iterate linearly and split by whitespace and O(n) auxiliary space
        print("String value",str_list)
        listMap = {}
        patternMap = {}
        if len(pattern) != len(str_list):
            return False
        for i in range(len(pattern)):
            listValue , patternValue = str_list[i],pattern[i]
            print(listValue,patternValue)
            if listValue not in listMap:# check value of String in map else add value of String and key value as patternValue
                listMap[listValue] = patternValue
            if patternValue not in patternMap: # check value of patternValue in map else add value of patternValue and key value as String
                patternMap[patternValue] = listValue
            if listMap[listValue] != patternValue or patternMap[patternValue] != listValue:##check value of patternValue and keyvalue of String is equal or not 
                return False
        return True
