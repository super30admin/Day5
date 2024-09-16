# Time Complexity : O(n)
# Space Complexity : O(m)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : NO

from collections import defaultdict
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        str1=s.split(' ')     
        print(str1)
        if len(str1)!=len(pattern):
            return False
        dict_PS=defaultdict(int)
        dict_SP=defaultdict(int)
        
        for i in range(len(pattern)):
            if pattern[i] not in dict_PS and str1[i] not in dict_SP:
                dict_PS[pattern[i]]=str1[i]
                dict_SP[str1[i]]=pattern[i]
            else:
                if dict_PS[pattern[i]]!=str1[i]:
                    return False
                elif dict_SP[str1[i]]!=pattern[i]:
                    return False
        return True
            