from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict1=defaultdict(list)
        def helper(str1):
            hasharr=[0]*26
            for i in str1:
                index=ord(i)-97
                hasharr[index]+=1
                
            return "".join(map(str,hasharr))    
        for i in strs:
            dict1[helper(i)].append(i)
        return dict1.values()  
        
time Complexity is O(sn) where s is the length of string.
Space complexity is O(n)
