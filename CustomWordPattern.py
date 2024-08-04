# // Time Complexity : O(N) where N is length of the pattern and O(1) to insert or read in the HashMap.
# // Space Complexity : O(N) where N is the max of 26 characters in pattern. If additional words then it will return false.
# // Did this code successfully run on Leetcode : Yes, It took time to resolve since it was failing for few test case while submission.
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
#Used two hashmap to store the pattern key and the associated word and other hash map to store the word and the associated patter character. check whether the key is already present 
#if yes then check the value and validate same value with other hash map value.

import numpy as np
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        splitString=[]
        if s=='':
            return False
        else:
            splitString = s.split()
        
        if (len(splitString)!=len(pattern)):
            return False
        
        wordKey ={}
        patterKey ={}
        for l in range(len(pattern)):
            
            if pattern[l] not in patterKey:
                patterKey[pattern[l]] = splitString[l]
                
            else:
                if patterKey[pattern[l]] != splitString[l]:
                    return False
           
                
            if splitString[l] not in wordKey:
                wordKey[splitString[l]] = pattern[l]
                
            else:
                if wordKey[splitString[l]] != pattern[l]:
                    return False
                
            if wordKey[patterKey[pattern[l]]] != pattern[l] or patterKey[wordKey[splitString[l]]] != splitString[l]:
                print("False Condition")
                return False 
            
        return True

obj = Solution()
print(obj.wordPattern( "abba","dog dog dog dog"))

print(obj.wordPattern( "abba","dog cat cat fish"))


print(obj.wordPattern( "abba","dog cat cat dog"))

print(obj.wordPattern( "aba","dog cat cat"))

print(obj.wordPattern( "aaa","aa aa aa aa aa"))