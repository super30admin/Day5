## Problem 3:


#Time Complexity : O(n), where n is for the for loop
# Space Complexity : O(26) constant 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# same as problem 2 approach: Here, we use two dicts to keep for linking and corresponding the strings but split the second string into list of words before linking 

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        d={}
        e={}
        str2 = str.split(" ")
        if len(pattern)!=len(str2):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in d:
                d[pattern[i]]=str2[i]
            else:
                if d[pattern[i]] !=str2[i]:
                    return False        
            if str2[i] not in e:
                e[str2[i]]=pattern[i]
            else:
                if e[str2[i]] !=pattern[i]:
                    return False
        return True