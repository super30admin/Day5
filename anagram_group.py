"""
TC: O(nk)
SC:O(n)

"""
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        primes = {'a': 2, 
                  'b': 3, 
                  'c': 5, 
                  'd': 7, 
                  'e': 11, 
                  'f': 13,
                  'g': 17,
                  'h': 19,
                  'i': 23,
                  'j': 29,
                  'k': 31,
                  'l': 37,
                  'm': 41,
                  'n': 43,
                  'o': 47,
                  'p': 53,
                  'q': 59,
                  'r': 61,
                  's': 67, 
                  't': 71,
                  'u': 73,
                  'v': 79,
                  'w': 83,
                  'x': 89,
                  'y': 97,
                  'z': 101
                 }
        map1={}
        for i in strs:
            product=1
            for j in i:
                product = primes[j]*product
            if product in map1.keys():
                map1[product].append(i)
            else:
                map1[product]=[i]
        op_list=[]
        for k in map1.keys():
            op_list.append(map1[k])
        return op_list
