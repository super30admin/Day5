# Time Complexity:- O(n) = length of the pattern
# Space Complexity:- O(2n)= storing two dictionaries of the same size
# Approach:- Maintain two dictionaries, one is the mapping from pattern to 
# string s and another is the mapping from string s to pattern. Everytime you encounter
# new pattern or a string check the mappings.
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s=s.split()
        if len(s)!=len(pattern):
            return False
        d={}
        e={}
        for i in range(len(pattern)):
            if pattern[i] in d and d[pattern[i]]!=s[i]:
                return False
            else:
                d[pattern[i]]=s[i]
            if s[i] in e and e[s[i]]!=pattern[i]:
                return False
            else:
                e[s[i]]=pattern[i]
        return True
        
            