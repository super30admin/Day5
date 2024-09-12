# Time complexity: O(n)
# Space Complexity: O(n)

# The programs successfully ran on Leetcode

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(' ')
        
        if len(pattern) == len(words):
            search = {}
            present = set()
            
            for i in range(len(pattern)):
                
                if pattern[i] in search:
                    if search[pattern[i]] != words[i]:
                        return False
                    
                else:
                    if words[i] not in present:
                        search[pattern[i]] = words[i]
                        present.add(words[i])
                        
                    else:
                        return False
                    
            return True
        
        return False
                    
        

# The approach is that each character in the pattern is mapped to a string the first time it is encountered. If a character is encountered again but 
# the string mapped to it is different than the current one return false.

