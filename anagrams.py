
#Given an array of strings, group anagrams together.

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
        
        dic = {}
        for st in str s:
            pdt=1
            for ch in st:
                pdt = pdt*primes[ch]
            if pdt in dic.keys():
                l1 = dic[pdt]
                l1.append(st)
                dic[pdt]=l1
            else:
                dic[pdt]=[st]
        res=[]        
        for val in dic.keys():         
            res.append(dic[val])
            
        return res    