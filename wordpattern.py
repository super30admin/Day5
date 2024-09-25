# Time Complexity : O(n)   - we are traversing through the strings
# Space Complexity : O(1)   - we are using constant space without having extra space.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        #this problem is same as isomorphic strings 
        #here we will match the characters in pattern with words in S by seperating and making them into a list 
        
        s = s.split()  #make the S string into an array of strings with words
        
        if len(pattern) != len(s):return False    
         
        #initiate two hashmaps for string 'Pattern' and array of strings 'S'
        hashMapS = {} 
        hashMapT = {} 
        
        for i in range(len(pattern)):   #iterate over the pattern string and assign the values to the the created HashMap 'S'
        
            hashMapS[pattern[i]] =  i 
                
        for j in range(len(s)): #iterate over the 'S' array and assign the values to the the created HashMap 'T'
        
            hashMapT[s[j]] = j 
        
         #if pattern and S are isomorphic, then the order of the characters stored in the hashmap corresponding to their values will be the same, so comparing the values says whether they both share same pattern
            
        if list(hashMapT.values()) == list(hashMapS.values()): 
        
            return True
        
        return False