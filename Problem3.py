#Time Complexity: O(n) where n is the combined length of all characters in the string (not pattern)

#Space Complexity: 
# O(1) considering that there can be maximum of 26 mappings in the hashMap

#Accepted on Leetcode

#Approach: 
#Iterate over pattern and 's':
#We will grab the ith alphabet of pattern and call it elementS
#for string 's' each string before space is one element - elementT
#So each alphabet will ideally be mapped to a string
# Use a hashMap and a hashSet, if elementS exists in hashMap, mapping must be same as elementT, else return False as elementS has already been mapped to some # other char
# If elementS doesn't exist in hashMap, elementT must not exist in set -> as otherwise it has already been mapped by some other s element



class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        patternMap = {}
        stringSet = set()

        pIndex = sIndex = 0

        while pIndex < len(pattern):
            pChar = pattern[pIndex]
            sWord, sIndex = self.getSWordAndIndex(s, sIndex)

            #if length unequal
            if sIndex == -1:
                return False
            
            if pChar in patternMap:
                if patternMap[pChar] != sWord:
                    return False
            else:
                if sWord in stringSet:
                    return False
                else:
                    patternMap[pChar] = sWord
                    stringSet.add(sWord)

            pIndex += 1


        if pIndex == len(pattern) and sIndex == len(s) + 1:
            return True
        
        #if length unequal
        return False


    def getSWordAndIndex(self, s, sIndex):
        if sIndex == len(s):
            return "", -1
        
        sWord = ""

        while sIndex < len(s) and s[sIndex]!=" ":
            sWord += s[sIndex]
            sIndex += 1
        
        return sWord, sIndex+1


