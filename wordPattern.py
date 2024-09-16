class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        
        patternMap = dict()
        stringMap = dict()
        
        stringArr = s.split(" ")
        
        if len(pattern)!=len(stringArr):
            return False
        
        for index,value in enumerate(pattern):
            
            if value not in patternMap:
                patternMap[value] = stringArr[index]
            
            else:
                if patternMap[value] != stringArr[index]:
                    return False
                
                
            if stringArr[index] not in stringMap:
                stringMap[stringArr[index]] = pattern[index]
            
            else:
                if stringMap[stringArr[index]] != pattern[index]:
                    return False
        
        return True
        
#  time complexity is o(n)
#  same approach as in isomorphic strings.
        
            
            
            
            
        
