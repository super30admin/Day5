# Time Complexity : O(n*k)
# Space Complexity : O(n*k)
# Leetcode : Solved and submitted

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        listing = {}
        
        # Going over the words given to us one by one
        for i in range(len(strs)):
            x = strs[i]
            
            # Call the prime_prod function by passing the string which would give the the product of prime numbers according to the string
            p = self.prime_prod(x)
            #print(x,p)
            
            # checking if we have a value at the value of prime product, if not, then create a list and add that string there
            if p not in listing:
                listing[p] = []
                listing[p].append(x)
            else:
                # If already present, then append the value at the end of the List
                y = listing[p]
                y.append(x)
                listing[p] = y
        
         # Finally return the values at the respective indexes
        return listing.values()
        
        
    def prime_prod(self, st):
        
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
        
        # Finding the prime product by multiplying the values of each assigned char above from the dict
        res = 1
        for i in range(len(st)):
            ch = st[i]
            res = res*primes[ch]
        
        return res
