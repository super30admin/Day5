class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        # 2 Methods:
        #     define your own hashkey identifier>>>each lowercase alpha is mapped to prime number
        #     product of primes is unique always
        #     so that product is equal for "ant"="nat"="tan" 
        #     thus instead of sorted version "ant" as key and using O(klogk) as sorting complexity
        #     we are reducing it by prime product hashkey O(k)
        #O(kN) final time complexity
        #O(N) space>>map
        
        mp={}
        def multiply(i):
            mul=1
            primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]
            i=list(i)
            for each in i:
                mul=mul*(primes[ord(each)-97])
            return mul
        
        for i in strs:
            #new="".join(sorted(i))
            new=multiply(i)
            if  new not in mp:
                #make entry in list itself
                mp[new]=[i]     
            else:
                #append in list value
                mp[new].append(i)
        #value array of arrays is returned
        return mp.values()
    
    

       