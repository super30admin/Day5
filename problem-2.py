# Time Complexity : O(nk)
# Space Complexity: O(nk)
# Leetcode Run: YES
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if len(strs)==0:
            return [strs]
        # getting 26 prime numbers
        prime=self.getPrime()
       # creating empty hash map 
        op={}
        # looping through given list
        for x in strs:
            val=1
            # looping through string at each index to calculate prime to avoid sorting
            for i in x:
                val*=prime[ord(i)-97]
            # if index value present just append else create index and put value
            if val in op:
                op[val].append(x)
            else:
                op[val]=[x]
        # finally we put all the values of map in list and return 
        
        return op.values()
    def getPrime(self):
        arr=[]
        i=2
        while(len(arr)<26):
            count=0
            for x in range(1,i+1,1):
                if i%x==0:
                    count+=1
            if count==2:
                arr.append(i)
            i+=1    
        return arr
   
            
            
            
            
        