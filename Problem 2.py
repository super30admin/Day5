# Time Complexity : O(min(len(s),len(l))
# Space Complexity :O(max(len(s),len(l))

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        #create 2 dicitonaries to keep track of mappings for word s and t
        dct_s = {}
        dct_t = {}
        #loop over any word and check for the mappings of the letters
        for idx,c in enumerate(s):
            #if mapping of letters not in dictionary then insert in the dictionaries
            if c not in dct_s and t[idx] not in dct_t:
                dct_s[c] = t[idx]
                dct_t[t[idx]] = c
            #if mapping is present and the corresponding  letter is different then return false, otherwise continue till end
            else:
                if (c in dct_s and t[idx] != dct_s[c]) or (t[idx] in dct_t and dct_t[t[idx]] != c) :
                    return False
        return True