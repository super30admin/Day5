# https://leetcode.com/problems/group-anagrams/
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Approach 1 : 
        # TC O(n klogk) where n is list of words, klogk is to sort each word SC O(n)
        # for every str s in list, create map of {sorted(s):[all strings that produce sorted(s)]}
        # return list of strings
        m = dict()
        # for s in strs:
        #     if not str(sorted(s)) in m:
        #         m[str(sorted(s))] = [s]
        #     else:
        #         m[str(sorted(s))].append(s)
        # return [m[k] for k in m.keys()]
        # Approach 2 :
        # TC O(n*k) where n is list of words, k is to calculate prime factor for each word SC O(n)
        # use prime array to calculate hash for each string instead of sorting
        for s in strs:
            r = self.getPrime(s)
            print(s, r)
            if not r in m:
                m[r] = [s]
            else:
                m[r].append(s)
        return [m[k] for k in m.keys()]
        
        
    def getPrime(self, s: str)-> int:
        primes=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101]
        r = 1
        for c in s:
            r *= primes[ord(c)-96-1] * ord(c)-96
        return r