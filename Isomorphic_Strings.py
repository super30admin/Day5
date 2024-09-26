//Time Complexity : O(N)
// Space Complexity : O(1)- assuming the two hashmaps space complexities will 26+26 which is constant. 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach: using 2 hashmaps and mapping from both ends



class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dic1 = {}
        dic2 = {}
        
        for i in range(0, len(s)):
            if s[i] in dic1:
                if dic1[s[i]] != t[i]:
                    return 0
            if s[i] not in dic1:
                dic1[s[i]] = t[i]  
            
            if t[i] in dic2:
                if dic2[t[i]] != s[i]:
                    return 0
            if t[i] not in dic2:
                dic2[t[i]] = s[i]
        return 1
