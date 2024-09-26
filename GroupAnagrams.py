# Time Complexity : O(n(klogk))
# Space Complexity : O(n*k)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A

# Your code here along with comments explaining your approach

from typing import List
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = []
        #To check if the strings are empty then return empty list []
        if(strs == None or len(strs)==0):
            return result
        HashMap={}
        #Iterate through each string in strs
        for s in strs:
            #Sort the alpabets in a string as list and then join it as a single string
            sorted_str = ''.join(sorted(s))
            if(sorted_str not in HashMap):
                #Add sorted_str as key and initialise value as empty list
                HashMap[sorted_str]=[]
            #if the key already exists then append the incoming string as value to that key
            HashMap[sorted_str].append(s)
        #retrun the values of hashmap as list      
        return list(HashMap.values())

            
        