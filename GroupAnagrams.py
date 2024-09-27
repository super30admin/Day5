class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        '''
        Brute force:
            Sort each word. so eat become ate make this as key in hashmap and store eat in list and 
            this list as value to key ate. Next, when we get tea, again after sorting, we get aet and this key present,
            So, we append to the list present at ate.
            
            Time Complexity - O(NWlogW) = O(N^2logN)
            
            Optimized Approach
            When we multiply 2 prime numbers, we get unique values
            key = multiplication value
            value = list of all words having same multiplicaton
            
            Multiplication is associative i.e. a*b=b*a
            
            Time Complexity - O(N*N)
            Space Complexity - O(NW) 
        
        '''
        
        # base case
        if len(strs) <=1:
            return [strs]
        
        result = {}
        self.primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]
        
        for word in strs:
            mul = self.multiply(word)
            if mul in result:
                result[mul].append(word)
            else:
                result[mul]=[word]
                
        return result.values()
            
    def multiply(self,word):
        mul=1
        for letter in word:  
            mul=mul*self.primes[ord(letter)-ord('a')]
        
        return mul
    
    
        