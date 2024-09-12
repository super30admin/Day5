#TC:O(1)
#SC:O(1)
#Leetcode: Yes
#Difficulties: Not sure about the TC and SC

#Here I am checking for the length os teh string and pattern are same or not and also checking the set of pattern and string match with the length of the string and pattern.

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        
        s=str.split()
        if  len(pattern) == len(s) and len(set(zip(pattern, s))) == len(set(pattern)) == len(set(s)):
                    return True
    
