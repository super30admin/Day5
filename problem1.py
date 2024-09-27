# Time Complexity : O(1)
# Space Complexity : O(n)
# Any problem you faced while coding this : logic behind:while storing the sorted element in dict


# Your code here along with comments explaining your approach

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        dict={}
        
        #sort the elements of the list one-by-one
        for ele in strs:
            sortedelement="".join(sorted(ele))
            
            #check sortedelement in dict if not add or append
            if sortedelement not in dict:
                dict[sortedelement]=[ele]
            else:
                dict[sortedelement].append(ele)
        result=[]
        
        #return the value
        for item in dict.values():
            result.append(item)
        
        return result