// Space Complexity : O(1)
// Any problem you faced while coding this : No

//Approach one 

// Time Complexity : O(nk logk)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashlist=[2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]     
        dictionary=dict()
        for s in strs:                      # O(n)
            temp=''.join(sorted(s))         # O(k logk)
            if temp not in dictionary:
                dictionary[temp]=[s]
            else:
                dictionary[temp].append(s)
        
        return [x for x in dictionary.values()]
        
        
//Approach Two

// Time Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashlist=[2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]     
        dictionary=dict()
        for s in strs:                              #O(n)
            #temp=''.join(sorted(s))
            temp=1
            for i in s:                              #O(k)
                temp=temp* hashlist[ord(i)-97]
            if temp not in dictionary:
                dictionary[temp]=[s]
            else:
                dictionary[temp].append(s)
        
        return [x for x in dictionary.values()]
