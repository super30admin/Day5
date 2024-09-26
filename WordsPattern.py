# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A

# Your code here along with comments explaining your approach
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        #To split a string with spaces into a list with each word in one index
        words = s.split()
        if(pattern==None or words==None):
            return False
        if(len(pattern)==0 or len(words)==0 or len(pattern)!=len(words)):
            return False
        #Declare a HashMap and Hashset
        pMap={}
        wSet=set()
        #Iterate through the length of pattern or words as both would be equal
        for i in range(len(pattern)):
            #Storing the character from pattern and corresponding character from words in pChar and wChar
            pChar = pattern[i]
            wChar = words[i]
            #Check if character is already present in pChar is mapped to wChar already in pMap
            if(pChar in pMap):
                #To check if the existing pChar matches incoming wChar 
                if(pMap[pChar]!=wChar):
                    return False
            #If sChar not present in pMap
            else:
                #Check if wChar is present wSet which denotes it is mapped with some other pChar previously
                if(wChar in wSet):
                    return False
                else:
                    #Else map pChar to wChar in pMap and add wChar to wSet
                    wSet.add(wChar)
                    pMap[pChar]=wChar
        return True

