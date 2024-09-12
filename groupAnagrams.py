class Solution(object):
    def calcPrimeProduct(self, s):
        
        primes = {'a':2, 'b':3, 'c':5, 'd':7, 'e':11, 'f':13, 'g':17, 'h':19, 'i':23, 'j':29, 'k':31, 'l':37, 'm':41, 'n':43, 'o':47, 'p':53, 'q':59, 'r':61, 's':67, 't':71, 'u':73, 'v':79, 'w':83, 'x':89, 'y':97, 'z':101}
        
        product = 1
        for i in s:
            product *= primes[i]
        return product
        
    def groupAnagrams(self, strs):
        if not strs:
            return []
        
        anagramMap = {}
        
        for i in range(len(strs)):
            s = strs[i]
            primeProduct = self.calcPrimeProduct(s)
            
            if not anagramMap.has_key(primeProduct):
                anagramMap[primeProduct] = []
            anagramMap[primeProduct].append(s)
        
        result = []
        for i in anagramMap.values():
            result.append(i)
            
        return result

# TC: O(NK), N is list size and K string size
# SC: O(NK), N strings of size K
