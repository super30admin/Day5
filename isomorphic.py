#Executed in leetcode
#Time complexity - O(n)
#space complexity - O(1)
#Idea- Using dictionaries to map the the characters and compare 
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapstring1={}
        mapstring2={}
        for char1,char2 in zip(s,t):
            if (char1 not in mapstring1) and (char2 not in mapstring2):
                mapstring1[char1]=char2
                mapstring2[char2]=char1
            elif mapstring1.get(char1)!=char2 or mapstring2.get(char2)!=char1:
                    return False
        return True