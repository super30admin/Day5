# take 2 hashMap 
# do one to one mapping from pattern to word and word and pattern using 2 hashmaps
# if there is duplicate mapping return False
# else return True
# TimeComplexity : log(n)
# SpaceComplexity:  log(n)
# leetcode : Works well 



class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        patternToWord = {}
        wordToPattern = {}
        listStr = s.split()

        if len(pattern) != len(listStr): return False

        for s in range(len(pattern)):

            p = pattern[s]
            w = listStr[s]
            if p in patternToWord and patternToWord[p]  != w:
                return False

            if w in wordToPattern and wordToPattern[w] != p:
                return False

            patternToWord[p] = w
            wordToPattern[w] = p

            # print(pattern[s], listStr[s])
        
        return True