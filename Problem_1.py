# 49. Group Anagrams

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        store1 = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        
        store2 = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
        
        mapping = {}
        
        for i in range(len(store1)):
            mapping[store2[i]] = store1[i]
        
        res = {}
        
        for i in strs:
            prod = 1
            for j in i:
                prod*=mapping[j]
            
            if prod not in res:
                res[prod] = []
            
            res[prod].append(i)
        
        return res.values()
            
                
# Time Complexity: O(N*M)
# Space Complexity: O(N)
# Accepted on Leetcode: Yes
# Faced any difficulty solving: No.