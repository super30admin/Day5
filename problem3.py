# Time Complexity : O(N) (Where N is length of Pattern)
# Space Complexity : O(NK) (Where K is longest word in str)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# * Same approch as problem 205 but in one loop.
# - Start with every charcter in pattern and same indexed word from str.
# - If mapping from pattern -> word exist check it's mapping is correct (If mapping is incorrect return False), otherwise assign new mapping. Do the same task for word -> pattern.
# - In the end return True.

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
#       Initialize two dictionaries.
        front, back = {}, {}
#       Split the str to get word list
        split_string = str.split(' ')

#       If length of pattern and split string is differnt that means mapping is wrong
        if len(pattern) != len(split_string):
            return False
        
#       Run loop till index is smaller than length of pattern.
        for index in range(len(pattern)):
#           Check pattern -> word mapping in front dictionary
            if (split_string[index] in front):
#               If mapping is incorrect return False
                if (front[split_string[index]] != pattern[index]):
                    return False
#           If mapping does not exist tahn assign new mapping.
            else:
                front[split_string[index]] = pattern[index]
                
#           Do the same above steps for word -> pattern mapping.
            if (pattern[index] in back):
                if (back[pattern[index]] != split_string[index]):
                    return False
            else:
                back[pattern[index]] = split_string[index]

#       In the end return True because two way mappign didn't return false.
        return True
