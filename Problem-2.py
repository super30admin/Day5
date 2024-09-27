# Isomorphic Strings
'''
Leetcode all test cases passed: Yes
Solution:
    isIsomorphic(self, s, t)):
        n is no of characters in s and t
        Space Complexity: O(256) + O(256) = O(1)
        Time Complexity: O(n)
'''

class Solution:
    def isIsomorphic(self, s, t):
        hashMap = {}
        hashSet = set()
        
        for a,b in zip(s,t):
            if a in hashMap:
                if  hashMap[a] != b:
                    return False
            else:
                if b in hashSet:
                    return False
                hashMap[a] = b
                hashSet.add(b)
            
        return True
