# Time Complexity : O(n)
# Space Complexity : O(1) as both dictionaries could at max contain 26 letters(A-Z)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : NO

from collections import defaultdict
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict_ST=defaultdict(int)
        dict_TS=defaultdict(int)
        
        for i in range(len(s)):
            if s[i] not in dict_ST and t[i] not in dict_TS:
                dict_ST[s[i]]=t[i]
                dict_TS[t[i]]=s[i]
            else:  
                if dict_ST[s[i]]!=t[i]:
                    return False
        return True