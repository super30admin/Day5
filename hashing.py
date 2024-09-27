# // Time Complexity :O(n*k)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :not sure about space complexity


# // Your code here along with comments explaining your approach



class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict={}
        for i in strs:
            pp=self.findPrimeProduct(i)
            # print(pp)
            # print(dict.keys())
            if pp in dict.keys():
                a=dict[pp]
                a.append(i)
                dict[pp]=a
                
            else:
                dict[pp]=[i]
            
                
        return dict.values() 
            

    def findPrimeProduct(self,num):
        li=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        mul=1
        
        for i in range(len(num)):
           
            mul=mul*li[ord(num[i])-ord('a')]
           
        return mul
            
            
            
        