"""
Approach

1. maintain 2 maps
2. firt map will have mapping from pattern to one of the strings of str, and the second map will have mapping from one of the string from str to a letter from pattern
3. for each letter in pattern, check if it has a mapping in str or if the string in str has a mapping in any of the letter of the pattern
4. if there is a mapping and in the input the mapping is not followed, return false

"""


# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        strArray = str.split()
        map1 = {}
        map2 = {}
        if len(strArray)!= len (pattern):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] in map1 or strArray[i] in map2:
                if pattern[i] in map1:
                    if map1[pattern[i]]!=strArray[i]:
                        return False
                if strArray[i] in map2:
                    if map2[strArray[i]]!= pattern[i]:
                        return False
            else:
                map1[pattern[i]]=strArray[i]
                map2[strArray[i]]= pattern[i]
        return True