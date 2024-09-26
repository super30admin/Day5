# S30 Big N Problem #13 {Easy}

# Given a pattern and a string , find if the string follows the pattern or not.
# Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

# Time Complexity : O(n) n= length of pattern
# Space Complexity : O(n) n= length of pattern
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        
        dic={}
        
        str=str.split(' ')
        
        if len(str)!=len(pattern):
            return False
        
        # store the word corresponding to patten in a dictionary
        for i,p in enumerate(pattern):
            
            if dic.get(p,-1)==-1:
                
                # if word already present in dictionary, return False
                if str[i] in dic.values():
                    return False
                else:
                    dic[p]=str[i]

            # if pattern does not correspond to word in dictionary, return false
            elif dic[p]!=str[i]:
                     return False
        
        return True
                
            
        