# Time Complexity : O(n * m) [ n - len of the given words and m : for each letter in the word]
    # In hash table, we are looping through each letter in the word and computing the product. This results in the O(len of letters in word) = O(m)
    # In actual function, we apply this hash function for each word, so, O(word count ) = O(n)
    # Total number of operations  = O (m*n)
# Space Complexity : O(n) for hash table.
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : YES 
    # I got an extra empty list in the result , I used result = [[]] expecting list of list. 
    # It took some time to realise that list will work. Since I am appending with the list it can be considered as list ([]) 

class Solution:
    def primeProductkeys(self, strs):
        # taken this for uniqueness (instead of sorting, this hash function reduces complexity)
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        
        # initial product value
        key = 1;
        
        # use ASCII value and deduce the product for each string
        for i in range(len(strs)):
            key = key * primes[ord(strs[i]) - 97]
        # print(key)
        
        # output the product.
        return key
        
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # print(strs)
        
        # for the grouping of all the anagrams 
        result = []
        
        # to map the prime product key and the given word
        hashmap = {}
        
        # iterate through each word and find the key
        for i in range(len(strs)):
            key = self.primeProductkeys(strs[i])
            
            #map all the values into the result
            if key in hashmap :
                hashmap[key].append(strs[i])
            else:
                hashmap[key] =  [strs[i]]
            
            if hashmap[key] not in result:
                result.append(hashmap[key])
            else:
                pass
        return result
    
  