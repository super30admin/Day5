'''
// Time Complexity : O(k log(k)) k - average number of letters in word
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    Logic was little difficult to derive

// Your code here along with comments explaining your approach
        - Calculate prime product of each string         
        - group strings with same prime product together 

'''

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        '''
        ["eat","tea","tan","ate","nat","bat"]
        - Calculate prime product of each string         
        - group strings with same prime product together 
        '''
        anagrams={}
        
        for word in strs:
            hashed=self.primeProduct(word)
            if hashed in anagrams:
                anagrams[hashed].append(word)
            else:
                anagrams[hashed]=[word]
        
        
        return [v for k,v in anagrams.items()]
            
    
    
    def primeProduct(self,st:List[str])->int:
        primes=[2,3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        result=1
        for ch in st:
            idx=ord(ch)-ord('a')
            result*=primes[idx]

        return result
            