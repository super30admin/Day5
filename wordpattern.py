class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s=s.split()
        if(len(pattern) != len(s)):
            return False
        hashmap1 = dict()
        hashmap2 = dict()
        
        for i in range(len(pattern)):
            if(hashmap1.get(pattern[i]) is None or hashmap1.get(pattern[i]) == s[i]):
                hashmap1[pattern[i]] = s[i]
            else:
                return False
        for i in range(len(s)):
            if(hashmap2.get(s[i]) is None or hashmap2.get(s[i]) == pattern[i]):
                hashmap2[s[i]] = pattern[i]
            else:
                return False
        return True