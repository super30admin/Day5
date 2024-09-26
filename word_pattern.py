# Time Complexity : O(N) N: Number of words in s
# Space Complexity : O(M) M: Number of unique charater in pattern and words in s 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = str.split(s)
        
        if len(pattern) != len(words):
            return False
        
        dic = {}
        
        for x in range(len(words)):
            if pattern[x] not in dic:
                # if we have a same word in s
                if words[x] in dic.values():
                    return False
                dic[pattern[x]] = words[x]
            else:
                if dic[pattern[x]] != words[x]:
                    return False
        return True
    
