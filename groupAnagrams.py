'''
Time Complexity : O(nk)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : I had added the Ascii value instead of multiplying it.
'''
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        dic={}
        for i in strs:
            val = 0
            val = self.calculateOrd(i)
            
            if val not in dic:
                dic[val] = [i]
            else:
                dic[val].append(i)
        
        arr = []

        for value in dic.values():
            arr.append(value)
        
        return arr

    
    def calculateOrd(self,i):
        p = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199]
        ordValue = 1
        r = 0
        for ele in i:
            r = ord(ele)-ord('a')
            ordValue *= p[r]
        return ordValue