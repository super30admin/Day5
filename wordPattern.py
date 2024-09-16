# TC: O(n)
# SC: O(n + n) , since we are using two hashmaps which basically would mean O(n)
# Did it work on leetcode? Yes
# Any problems: No

class Solution:
    def wordPattern(self, string: str, pattern: str) -> bool:
        pattern = pattern.split()
        
        if len(pattern) != len(string):
            return False
        else:
            pMap = {}
            sMap = {}

            for i in range(len(pattern)):
                if pattern[i] in pMap.keys():
                    if pMap[pattern[i]] != string[i]:
                        return False
                else:
                    pMap[pattern[i]] = string[i]

            for i in range(len(string)):
                if string[i] in sMap.keys():

                    if sMap[string[i]] != pattern[i]:
                        return False
                else: 
                    sMap[string[i]] = pattern[i]


            return True
            
            
        