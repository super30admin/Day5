#Time complexity: O(nk) where n is the length of list and k is the length of word
#Space Complexity:O(1)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        primes=[2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101]
        dictn={}
        for i in range(len(strs)):
            product=1
            word=strs[i]
            for l in word:
                product=product*primes[ord(l)-ord('a')]
            if product not in dictn:
                dictn[product]=[word]
            else:
                dictn[product].append(word)
        return dictn.values()
                