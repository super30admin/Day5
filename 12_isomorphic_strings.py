# S30 Big N Problem #12 {Easy}

# Given two strings s and t, determine if they are isomorphic.
#Two strings are isomorphic if the characters in s can be replaced to get t.
#All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

# Time Complexity : O(n) n= no. of chars in string
# Space Complexity : O(n) n= no. of chars in string
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        dic={}
        
        for i,char in enumerate(s):

            # map every char in string s to string t with respect to index
            if dic.get(s[i],-1)==-1:
                if t[i] in dic.values():
                    return False
                else:
                    dic[s[i]]=t[i]
            elif dic[s[i]]!=t[i]:
                return False
            
        return True
        