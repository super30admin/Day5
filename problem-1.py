'''
Approach: Iterate over each string of list and compute prime product of each string, If the prime product of string is present in the dictionary, append the string to the corresponding key's value list, else create a new key: value<list> pair. Iterate over dictionary to get all the values

Time complexity: O(nk)
n is length of array and k is total length of strings

Space complexity: O(nk)

'''
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = {}
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        final = []
        
        for str1 in strs:
            x=1
            for char in str1:
                x *= primes[ord(char)-ord('a')]
                
            print(x)
            if x in res:
                res[x].append(str1)
            else:
                res[x] = [str1]
        for k,v in res.items():
            final.append(v)
        return final
