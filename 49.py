Time Complexity : O(n)
Space Complexity : O(n)
Runs on LeetCode : Yes
Doubts :  # Should we include space complexity as O(n) even though we use it to print to output?


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        dict1={}
        
        for i in strs:
            x = str(sorted(i))
            if x not in dict1:
                dict1[x] =[i]
            else:
                dict1[x].append(i)
        return dict1.values()