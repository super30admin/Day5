'''
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
'''


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        dic={}
        ric = {}
        arr = list(s.split(" "))
        
        if len(arr) != len(pattern):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] not in dic:
                dic[pattern[i]] = arr[i]
            else:
                if dic[pattern[i]] != arr[i]:
                    return False
                
            if arr[i] not in ric:
                ric[arr[i]] = pattern[i]
            else:
                if ric[arr[i]] != pattern[i]:
                    return False
            
                
        return True