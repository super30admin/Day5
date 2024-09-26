#Time Complexity : O(n)
#Space Complexity : O(n) for the dictionaries
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this :

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        splitList = str.split()
        if len(pattern) != len(splitList):
            return False

        mappingToStr = {}
        mappingToPattern = {}

        for i in range(len(pattern)):
            patternLetter = pattern[i]
            wordFromList = splitList[i]

            if patternLetter not in mappingToStr:
                if wordFromList in mappingToPattern:
                    return False
                mappingToStr[patternLetter] = wordFromList
                mappingToPattern[wordFromList] = patternLetter

            if patternLetter in mappingToStr and wordFromList != mappingToStr[patternLetter]:
                return False

        return True