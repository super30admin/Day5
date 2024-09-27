#Time Complexity : O(m*n) n-size of list, m-average size of each string in list
#Space Complexity :O(n)
#Did this code successfully run on Leetcode :Yes
#Any problem you faced while coding this :No


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
       
        res =defaultdict(list) # mapping charCOunt to list of anagrams
        
        for i in strs:
            count=[0] *26 # 26 0s, one for each character
            
            for j in i:
                
                count [ord(j) - ord("a")] += 1
            
            res[tuple(count)].append(i) # count is a list and lists cannot be keys in python and tuples a
        return res.values()
            

                
        
