#time-comp- O(n+m) n= length of pattern and m= words in s
#space- O(k) unique pairs in the dict
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        d1={} #Dictionary to store key-val pair
        d2={}
        s=s.split(' ') #split the words
        #check if length is not equal
        if len(pattern)!=len(s):
            return False
        for i in range(0,len(pattern)):
            if pattern[i] not in d1:
                if s[i] not in d2:
                    d1[pattern[i]]=s[i]
                    d2[s[i]]=pattern[i]
                    print(d1)
                else:
                    return False
            elif d1[pattern[i]]!=s[i]:
                    return False
        return True

    
