# Hashing-1

## Problem 1: Given an array of strings, group anagrams together. (https://leetcode.com/problems/group-anagrams/)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs) == 0:
            return []
        Map = {}
        for astr in strs:
            primeProduct = self.getPrimeProduct(astr)
            if primeProduct not in Map:
                Map[primeProduct] = []
            Map[primeProduct].append(astr)
        return Map.values()
    
    def getPrimeProduct(self, s:str)-> int:
        primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103]
        result = 1
        for i in range(len(s)):
            c = s[i]
            result = result * primes[ord(c)-ord('a')]
        return result
# TC = O(nk)

## Problem 2: Given two strings s and t, determine if they are isomorphic.(https://leetcode.com/problems/isomorphic-strings/)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!= len(t):
            return False
        sMap= [None] *256
        tMap= [None] *256
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            index1 = ord(sChar)
            index2 = ord(tChar)
            if sMap[index1] != None:
                if sMap[index1] != tChar:
                    return False
            else:
                sMap[index1] = tChar
            if tMap[index2] != None:
                if tMap[index2] != sChar:
                    return False
            else:
                tMap[index2] = sChar
        return True

# TC = O(n) ; SC = O(1)