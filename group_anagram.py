# Time Complexity : O(N klog K) - N: length of the string and K is the maximum length of the string  in strs outer loop O(N) since need to iterate 
#through each string and sorting takes place in O(k log K)
# Space Complexity : O(NK)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # initialize dictinary  
        dic = {}
        
        # join word in sorted manner and check in dic if not add to dic with sortedword as key and value as same as input
        for word in strs:
            sortedword = "".join(sorted(word))
            
            if sortedword not in dic:
                dic[sortedword] = [word]
                
                
            else:
                dic[sortedword].append(word)
                
        # again iterate though values and append the values in res  
        result = []
        for item in dic.values():
            result.append(item)
            
        return result
