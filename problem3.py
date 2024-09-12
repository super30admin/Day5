#string pattern
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = str.split(s)
        if len(pattern)!=len(words):
            return False
        
        mydict = {}
        result = True
        
        for i in range(len(pattern)):
            if pattern[i] not in mydict:
                if words[i] not in mydict.values():
                    mydict[pattern[i]]=words[i]
                else:
                    result = False
                    break
            else:
                if mydict[pattern[i]]!=words[i]:
                    result = False
                    break
        return result
                