  
// Time Complexity : O(nm) - m is length of eachstring inside the str
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach: used problem-k approach assigning each alphabet to a prime number and multiplying all the strings to check 
for anagrams. and stori in hash map. used list inside the hashmap to store multiple values for one key i.e anagram-multiplied value



class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        
        prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        
        dic = {}
    
        def PrimeValue(string):
            prod = 1
            for i in string:
                prod =  prod * prime[ord(i)-ord('a')]
            return prod
        for i in strs:
            temp = PrimeValue(i)
            if PrimeValue(i) in dic:
                dic[temp].append(i)
            else:
                dic[temp] = [i]
        return dic.values()
