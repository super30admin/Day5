from collections import defaultdict
class Solution:
        
    def __init__(self):
        
        self.similarity_dict = defaultdict(lambda : [])
        
    def str_to_alphabetNo(self, ch):
        
        alpha_no = ord(ch) - ord('a')
        return alpha_no
        
    def groupAnagrams(self, strs):
        
        if strs is None or len(strs) < 1:
            return
        
        for i in strs:
            count = [0] * 26
            for ch in i:
                alpha_no = self.str_to_alphabetNo(ch)
                count[alpha_no] += 1
                
            self.similarity_dict[tuple(count)].append(i)
            
        return list(self.similarity_dict.values())
            
            
        
        
        