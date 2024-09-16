class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        # prime product method: => Time complexity: O(N.k)
        
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        hm = {}
        
        for i in strs:
            mul = 1
            for k in i:
                mul *= primes[ord(k)-ord('a')]
            
            if mul not in hm:
                hm[mul] = [i]
            else:
                hm[mul].append(i)
        
        return hm.values()
        
        # sort method => Time complexity: O(Nklogk)
        '''
        hm = {}
        for i in range(len(strs)):
            x = ''.join(sorted(strs[i]))
            if x in hm.keys():
                hm[x].append(strs[i])
            else:
                hm[x] = [strs[i]]
        
        return hm.values()
        '''