class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        chartoword={}
        wordtochar={}
        words = s.split(" ")
        if len(words) != len(pattern):
            return False
        for i in range(0,len(pattern)):
            mychar = pattern[i]
            myword = words[i]
            if mychar in chartoword and chartoword[mychar] != myword:
                return False
            else:
                chartoword[mychar] = myword
            if myword in wordtochar and wordtochar[myword] != mychar:
                return False
            else:
                wordtochar[myword] = mychar
        return True

        