 # Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Split the string with space and created a hashmap to save the occurence and matching character and if there 
#exists characted already the present ouccurence is matching or not matching
# if matching continue else return False

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(" ")
        if len(s) != len(pattern):
            return False
        a = {}
        b= {}
        for i in range(len(pattern)):
            if pattern[i] not in a:
                a[pattern[i]] = s[i]
                if s[i] in b:
                    return False
                b[s[i]] = pattern[i]
            else:
                if a[pattern[i]] != s[i]:
                    return False
        return True