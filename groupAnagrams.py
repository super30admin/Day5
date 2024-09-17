#TimeComplexity:O(1)
#SpaceComplexity: O(n)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
#Implement Stack using Array.
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        dict={}
        for A in strs:
            #print(A)
            score=self.primeScore(A)
            if dict.get(score)==None:
                dict[score]=[]
            dict[score].append(A)
            #print(dict)
        return dict.values()
        
        
        
    def primeScore(self,Str):
        primes=[2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101]
        mul=1
        for i in Str:
            mul=mul*primes[ord(i)-ord('a')]
        return mul
