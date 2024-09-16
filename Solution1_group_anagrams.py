// Time Complexity : O(n)  
//                 : Iterate n elements and sort the element
//                   (o (n))+o(log(n))=o(n)
// Space Complexity : O(n)
//                  : Store n elements in dictionary
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
'''
1. Iterate over elements in elements
2. for each element in string, sort the element and check if its keys.
3. If it's not present use sorted element value as key and 
   store element in list as Key value pair
4. Return the values
'''


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d={}
        
        for i in strs:
            v=[j for j in i]
            v.sort()
            v=''.join(v)
            
            if v in d.keys():
                d[v].append(i)
            else:
                d[v]=[i]
                
        return d.values()
            
            
            