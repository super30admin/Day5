# Time Complexity : O(n)   - we are traversing through the strings
# Space Complexity : O(1)   - we are using constant space without having extra space.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):return False    #if the length of two strings is not the same, then there is no way they can be isomorphic
    
        hashMapS = {} #initiate two hashmaps for strings S and T
        hashMapT = {} 
        
        for i in range(0, len(s)):  #iterate over the S string and assign the values to the the created HashMap 'S'
        
            hashMapS[s[i]] =  i 
                
    
        for j in range(0, len(t)):  #iterate over the T string and assign the values to the the created HashMap 'T'
        
            hashMapT[t[j]] = j 
        

        if list(hashMapT.values()) == list(hashMapS.values()): #if the strings are isomorphic, then the order of the characters stored in the hashmap corresponding to their values will be the same, so comparing the values says whther the given strings are isomorphic.
        
            return True
        
        return False