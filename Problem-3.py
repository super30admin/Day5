# Word Pattern
'''
Leetcode all test cases passed: Yes
Solution:
    wordPattern(self, pattern: str, s: str):
        n is no of characters in pattern and no of word in s
        Space Complexity: O(26) + O(26) = O(1)
        Time Complexity: O(n)
'''

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(" ")
        if len(s) != len(pattern):
            return False
        hashMap = {}
        hashSet = set()
        
        for a,b in zip(pattern,s):
            if a in hashMap:
                if  hashMap[a] != b:
                    return False
            else:
                if b in hashSet:
                    return False
                hashMap[a] = b
                hashSet.add(b)
            
        return True
