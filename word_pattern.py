class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        words = str.split(" ")
        if len(words) != len(pattern):
            return False      
        mapping = { } # key is the pattern, value is the word       
        for i in range(len(pattern)):
            if pattern[i] not in mapping:
                if words[i] not in mapping.values(): 
                    mapping[pattern[i]] = words[i]
                else:
                    return False
            else:
                if  mapping[pattern[i]] != words[i]:
                    return False
        return True