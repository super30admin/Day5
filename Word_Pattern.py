//Time Complexity : O(N)
// Space Complexity : O(M)- m is the length of the number of words in the str
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach: using two hashmaps and checking 



class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
       
        string = str.split(" ")
        
        if len(pattern) != len(string):
            return 0
        
        dic1 = {}
        dic2 = {}
        
        for i in range(0, len(pattern)):
            if pattern[i] in dic1:
                if dic1[pattern[i]] != string[i]:
                    return 0
                
            if pattern[i] not in dic1:
                dic1[pattern[i]] = string[i]
            
            if string[i] in dic2:
                if dic2[string[i]] != pattern[i]:
                    return 0
                
            if string[i] not in dic2:
                dic2[string[i]] = pattern[i]
        
        return 1
