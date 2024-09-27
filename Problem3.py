
#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : NO


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hashMap ={}
        arr = s.split()
        if len(pattern)!= len(arr):
            return False
        for i in range(len(pattern)):
            char1, char2 = pattern[i], arr[i]
            if char1 not in hashMap:
                if char2 in hashMap.values():
                    return False
                hashMap[pattern[i]] = arr[i]
            else:
                if hashMap[char1] != char2:
                    return False
            
        return True
