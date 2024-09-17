"""
Approach

1. maintain 2 maps
2. firt map will have mapping from s to t and the second map will have mapping from t to s
3. for each letter in s, check if it has a mapping in t or if the letter in t has a mapping in s
4. if there is a mapping and in the input the mapping is not followed, return false

"""


# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if s == None or t==None:
            return false
        
        map1 = {}
        map2 = {}
        
        for i in range(len(s)):
            if s[i] in map1 or t[i] in map2:
                if s[i] in map1 and map1[s[i]]!=t[i]:
                    return False
                if t[i] in map2 and map2[t[i]]!=s[i]:
                    return False
            else:
                map1[s[i]]= t[i]
                map2[t[i]] = s[i]
        return True
