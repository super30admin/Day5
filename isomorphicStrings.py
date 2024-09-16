# Word Pattern (https://leetcode.com/problems/word-pattern/)
# Time complexity: O(n); n=no of elements in string 
# Space complexity: O(m); m=no of unique patterns in string 
# Did this code successfully run on Leetcode : Yes
# Approach: Hashing (Explained in detail in comments)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
        
        dic = {}
    
        #Loop through all the characters in "s" 
        for i in range(len(s)):
            x = s[i]
            y = t[i]
            
            # Check if the character from 's' is present in the hashmap. 
            if x in dic.keys():
                
                # Check if its value matches the corresponding value in "t"; continue
                if dic[x] == y:
                    continue
                else:
                    return False
            
            # Character from 's' is not present in the hashmap. 
            else:
                # Check if the character it is replacing is already taken or not 
                if y in dic.values():
                    return False
                dic[x] = y
                
            print(dic)
                
        return True