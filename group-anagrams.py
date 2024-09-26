'''
T.C: O(N*K) - N - size of strs, K - avg. length of string in strs
S.C: O(N)

Intuition: The common identification between grouping the anagrams is that the anagrams consists of same ordered characters 
when sorted and same length. Using prime numbers - prime fact form for calculating the hash of the string and matching with 
anagrams.
'''
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            return []
        
        final = dict()
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        
        for string in strs:
            ssum = 1
            for char in string:
                ssum *= primes[ord(char) - ord('a')]
            if ssum in final:
                final[ssum].append(string)
            else:
                final[ssum] = [string]
                
        return [final[key] for key in final]
            
        