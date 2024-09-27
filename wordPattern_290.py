'''
time = O(n) --- Looping through all the characters in the string

space = O(1) -- constant space for 26 characters

Ran in Leetcode -- yes

Did you face any issues -- No

Method - Used one hashmap to store pattern and its corresponding string. Used second Hashset to check if the value already exists in the map
'''

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map = {}
        mySet = set()
        strList = s.split(" ")

        if len(pattern) != len(strList):
            return False       
       
        for i in range(len(pattern)):
            if(map.__contains__(pattern[i])):
                if(map[pattern[i]]!=strList[i]):
                    return False   
            else:
                if(mySet.__contains__(strList[i])):
                    return False
                else:
                    map[pattern[i]] = strList[i]
                    mySet.add(strList[i])

        return True


sol = Solution()
pattern = "abc"
s = "b c a"
print(sol.wordPattern(pattern,s))