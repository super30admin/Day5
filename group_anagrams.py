# Time Complexity: O(n*k) --> a for loop to trverse list of input strings and a for loop to traverse each character in each string
# Space Complexity:O(n*k) --> creation of hashmap and list
class Solution:
    # calculate the prime number multiplication value
    def calc_P(self, strs):
        # list of first 26 prime numbers
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        
        res = 1
        
        for  i in range(len(strs)):
            ch = strs[i]
            # update the res with elem at (ch - 'a') position
            res *= primes[ord(ch) - ord('a')]
        # return res(can be long value)
        return int(res)
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        self.hashmp = {}
        
        for i in strs:
            # get the prime value
            primev = self.calc_P(i)
            
            # check if the prime value is already present keys of hashmap 
            if(primev not in self.hashmp.keys()):
                # if true then add a empty list as we have to create list of lists to store the similar values
                self.hashmp[primev] = []
            # append i in the list at prime value position
            self.hashmp[primev].append(i)
        # return all the values as the solution
        return self.hashmp.values()
