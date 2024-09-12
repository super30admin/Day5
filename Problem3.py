"""Time Complexity - O(m*n) where m is min length of pattern and s
                                n is number of keys in dictionary i.e. traversed while checking if element is in dictionary
Space Complexity - O(m) where m is size of dictionary"""

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        st_s = s.split(' ') 
        index_s = 0
        index_p = 0
        pattern_dict ={}
        
        while index_s < len(st_s) and index_p < len(pattern):
            if pattern[index_p] in pattern_dict:
                if pattern_dict[pattern[index_p]] != st_s[index_s]:
                    return False
            else:
                if st_s[index_s] in st_s[:index_s] and index_s != 0:
                    return False
                else:
                    pattern_dict[pattern[index_p]] = st_s[index_s]
            
            index_p += 1
            index_s += 1
        
        if index_s == len(st_s) and index_p == len(pattern):
            return True
        else:
            return False