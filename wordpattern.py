#Time Complexity: O(n)
#Space complexity: O(n)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        string=s.split() #string=["dog","cat","cat","fish"]
        dict1={}
        dict2={}
        if len(string)!=len(pattern): 
            return False
        for i in range(len(pattern)):
            if pattern[i] not in dict1:
                dict1[pattern[i]]=string[i]
            elif pattern[i] in dict1 and dict1[pattern[i]]!=string[i]:
                return False
            if string[i] not in dict2:
                dict2[string[i]]=pattern[i]
            elif dict2[string[i]]!=pattern[i]:
                return False
        return True
                