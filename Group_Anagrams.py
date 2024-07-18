#Time Complexity O(n)
#Space Complexity O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        prime = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,87,89,97]
        
        #get the unique value of strings with same char using the prime array
        store_val = {}

        for i in range(len(strs)):
            prod = 1
            for c in strs[i]:
                prod *= prime[ord(c)-97]
            if prod in store_val:
                store_val[prod].append(strs[i])
            else:
                store_val[prod]= [strs[i]]
        
        return list(store_val.values())