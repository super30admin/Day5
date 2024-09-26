#Time and space complexity is O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict={}
        
        s=s.split(" ")
        print(s)
        if len(s)!=len(pattern):
            return False
        
        for i in range(len(s)):
            if pattern[i] not in dict:
                if s[i] in dict.values():
                    return False
                dict[pattern[i]]=s[i]
            elif dict[pattern[i]]!=s[i]:
                return False
        return True