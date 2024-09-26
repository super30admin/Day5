# -*- coding: utf-8 -*-
"""
Space Complexity : O(N) as we are using a Hashmap
Time Complexity : O(N) for traversal and O(1) for lookup
Did the program run for all test cases ? Yes
"""

class Solution:
    def groupAnagrams(self,strs):
        #Edge case check
        if not strs:
            return []
        #create a hashmap
        hashmap = {}
        #iterate through every element in the given string
        for word in strs:
            #store the result of primeproduct multiplication in P var
            P = S.PrimeProduct(word)   
            #if product not present in hashmap, create one
            if P not in hashmap:
                hashmap[P] = [word]
            else:
                hashmap[P].append(word) #else, append to the same list
        return [v for k, v in hashmap.items()] #return the hashmap
            
       

    def PrimeProduct(self,word):
        result = 1
        primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]  
        for i in word:#iterate through every letter in word
            result = result * primes[ord(i) - ord('a')] #subtract ascii value at i * ascii of 'a' and access prime[subtracted result]
        return result


strs = ["tin","ram","zip","cry","pus","jon","zip","pyx"]

S = Solution()
print(S.groupAnagrams(strs))


