class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        def primeProduct(word):
            result = 1
            prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
            for i in word:
                result = result*prime[(ord(i)-97)]
            return result
        
        final = {}
        
        for i in strs:
            hash1 = primeProduct(i)
            if hash1 in final:
                final[hash1].append(i)
            else:
                final[hash1] = [i]
        
        return(final.values())
        
        
# Time complexity is O(nl) where n is number of elements in the list and l is the length of each element
# Space compleixty is O(n) worst case scenario where there are no anagrams
        
        
        
##################################### Brute Force Solution Below ##################        
        '''result = {}
        
        for i in strs:
            if "".join(sorted(i)) in result:
                result["".join(sorted(i))].append(i)
            else:
                result["".join(sorted(i))] = [i]
        
        return(list(result.values()))'''