// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def calcPrime(self,x): #Assigning prime numbers and finding product. 
        primeArray=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        total=1
        for i in x:
            total=total*primeArray[ord(i)-ord('a')] # this product will give us a key which is unique for every set of string

        return total
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        di={}
        res=[]
        '''for i in strs:
            x=''.join(sorted(i)) # my method using sorting. Not efficient enough as it uses O((n^2)logn).
            
            if x in di:
                di[''.join(x)]=di.get(x,0)+[i]
            else:
                di[''.join(x)]=[i]
        for i in di.values():
            res.append(i)
        return res'''
        for i in strs:
            x=self.calcPrime(i) # key is generated here
            if x in di:
                di[x]=di.get(x,0)+[i] # if key already present, add string to the  hashmap
            else:
                di[x]=[i] # start a new key
        for i in di.values():
            res.append(i)
        return res # return result
