class Solution:
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # sorting the words

        #TC: O(nklogk) sc: O(n)
        
        # if strs is None or len(strs) == 0:
        #     return []

        # dic = {}
        # for i, val in enumerate(strs):
        #     sortedVal = "".join(sorted(val))
        #     if sortedVal in dic:
        #         dic[sortedVal].append(val)
        #     else:
        #         dic[sortedVal] = [val] 
        
        # result = list(dic.values())
        # return result

        #using product of prime numbers

        #TC: O(nk) sc: O(n)

        if strs is None or len(strs) == 0:
            return []

        dic = {}

        def primeProduct(val):
            primeList = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113]
            product = 1
            for i in val:
                product = product * primeList[ord(i) - ord('a')]
            return product
            

        for i, val in enumerate(strs):
            pp = primeProduct(val)
            if pp in dic:
                dic[pp].append(val)
            else:
                dic[pp] = [val] 
        
        result = list(dic.values())
        return result
   
 

 
