class Solution:
    '''
    Done using approach discussed in class, product of prime number. 
    The constructor will be called only once.
    Complexity:
        Time: O(k*n) where n is number of strings and k is size of strings
        Space: O(k*n) where n is number of strings and k is size of strings

    '''
    def __init__(self):
        self.prime = []
        i = 2
        # get first 26 prime numbers, lower case english letters
        while(len(self.prime)<26):
            f=0
            for b in range(2, i//2 + 1):
                if(i%b==0):
                    f=1
                    break
            if(f==0):
                self.prime.append(i)
            
            i+=1
            
            
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        x = {}
        for i in range(0,len(strs)):
            n=1
            for j in range(0,len(strs[i])):
                n *= self.prime[ord(strs[i][j])%97] 
            if(n in x.keys()):
                x[n].append(strs[i])
            else:
                x[n] = [strs[i]]
        
        return x.values()