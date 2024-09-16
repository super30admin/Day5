# TC:O(n)
# SC:O(n)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(' ')
        hash1={}
        hash2={}
        if (len(words)!=len(pattern)):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in hash1:
                hash1[pattern[i]]=words[i]
            else:
                if hash1[pattern[i]]!=words[i]:
                    return False
            if words[i] not in hash2:
                hash2[words[i]]=pattern[i]
            else:
                if hash2[words[i]]!=pattern[i]:
                    return False
        return True