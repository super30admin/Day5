'''https://leetcode.com/problems/group-anagrams/
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
'''

# Time Complexity : O(kN) where N is total words and k is average length of each word
# Space Complexity : O(kN) where k is average length of word
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    
    def getHash(self, s):
        ''' 
        associate a prime number with each ascii value of character.
        product of different primes will always create different hash values
        Alternatively can sort the word in ascending order, but that would cost klog(k).
        '''
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113]
        hash_val = 1
        for c in list(s):
            hash_val *= primes[ord(c)-ord('a')]
        return hash_val


    def groupAnagrams(self, strs: 'list[str]') -> 'list[list[str]]':
        hashMap = {} # {key}ascii -> {value}[anagrams list]
        
        for word in strs:
            # group all words with same hash value in a list
            # and store it in hash map
            hv = self.getHash(word)
            if hashMap.get(hv) is None:
                hashMap[hv] = [word]
            else:
                hashMap[hv].append(word)
        
        return list(hashMap.values()) # return in expected format