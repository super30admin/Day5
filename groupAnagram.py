#Time complexity = 0(nlongm) where m is length of string
#Space complexity = 0(mn)


from collections import defaultdict


class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        res = defaultdict(list)
        
        for s in strs:
            count = [0]*26
            
            for c in s:
                count[ord(c) - ord("a")] +=1   # taking the difference between the ASCII value of the specific char with the ASCII value of A
                
            res[tuple(count)].append(s)
            
        return res.values()
        