class Solution(object):
    def wordPattern(self, pattern, str):
        s=str.split()
        if(len(pattern)!=len(s)):
            return False
        dict={}
        for i in range(len(pattern)):
            if pattern[i] in dict:
                if dict[pattern[i]]!=s[i]:
                    return False
            else:
                if s[i] in dict.values():
                    return False
                else:
                    dict[pattern[i]]=s[i]
        return True
