'''
Time Complexity: O(n) where n is length of the string s
Space Complexity: O(n*m) where n is length of pattern and m is avg length of string 
Run on Leetcode: YES
'''
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pMap = {}
        sSet = set()
        strings = s.split(' ')
        if len(pattern) != len(strings):
            return False
        for index in range(len(pattern)):
            if pattern[index] in pMap.keys():
                if pMap[pattern[index]] != strings[index]:
                    return False
            else:
                if strings[index] in sSet:
                    return False
                pMap[pattern[index]] = strings[index]
                sSet.add(strings[index])
        return True
        