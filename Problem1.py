# Time Complexity : O(nlogn)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : 
# Your code here along with comments explaining your approach

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic = {}
        for word in strs:
            # New word is a representation of letter in sorted manner
            new_word = "".join(sorted(word))
            
            # Store sorted letters or word as key and original word as value
            if new_word not in dic:
                dic[new_word] = [word]
            else:
                dic[new_word] += [word]
        
        # Return values 
        return dic.values()
    
