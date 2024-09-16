/ Time Complexity   : O(n)  
//                  : Iterate n letters 

// Space Complexity : amortized O(1)  ?
//                  : Unique 26 letters.

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
'''
1. Check for length if not equal exit
2. Iterate over letter in both the string
3. for each character in s and t, 
                      check if it is present in dictionary
					  else add to dictionary
4. if in dictionary, the value stored for key must be same as index 
   value from the other string	if not return false  
5. The condition should be checked for the
   string i.e s has keys in one dictionary and 
   t has keys in other dictionary
4. Return True after traversing th entire list
'''







class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sd={}
        td={}
        
        if len(s)!=len(t):
            return False
        
        for i in range(0,len(s)):
            
            s_val= s[i]
            t_val= t[i]
            
            if s_val in sd:
                if sd[s_val] != t_val:
                    return False
            else:
                sd[s_val]=t_val
                
            if t_val in td:
                if td[t_val] != s_val:
                    return False
            else:
                td[t_val]=s_val
        return True
                
        
        
            
            
            