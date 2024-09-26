# Sorce : https://leetcode.com/problems/word-pattern/
# Time Complexity : O(n)
# Space Complexity : O(1)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dic = {}
        #Splitting the string and adding it to a list
        l= s.split(' ')
        #return false if length is unequal
        if len(pattern)!= len(l):
            return False

        #since the length is equal iterate through any of the string's length
        for i in range(len(pattern)):
            #if s[i] exists as key in dict
            if pattern[i] in dic:
                #check for the value from dict if it is equal to the value at the same index in another string
                if dic[pattern[i]] != l[i]:
                    return False
            # if the value is not in the dict, add the key-value pair                   
            elif l[i] not in dic.values():
                dic[pattern[i]]= l[i]
            else:
                return False
            
        return True    
                
        