'''
Time complexity :O(n)
Space complexity : O(1)
'''
from collections import defaultdict 
class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        dict1=defaultdict(list)
        for i in range(len(pattern)):
            dict1[pattern[i]].append(i)
    
        dict2=defaultdict(list)
        l1=list(str.split())
        for ii in range(len(l1)):
            dict2[l1[ii]].append(ii)
            
        if len(dict1)!=len(dict2):
            return False
        elif list(dict1.values())==list(dict2.values()):
            return True
        else:
            return False


s = Solution()
print(s.wordPattern("abba", "dog cat cat dog"))
print(s.wordPattern("abba", "dog cat cat fish"))
print(s.wordPattern("aaaa", "dog cat cat dog"))
print(s.wordPattern("abba", "dog dog dog dog"))
        
        