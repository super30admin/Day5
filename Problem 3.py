# Time Complexity : O(n) where n is lenght of pattern/string
# Space Complexity :O(n) where n is lenght of pattern/string

class Solution:
    def wordPattern(self, pattern: str, strng: str) -> bool:
        # create an array of words in string
        strng = strng.split(" ")
        # if the lenght of string and patterna re different then return False
        if len(pattern) != len(strng):
            return False
        # create 2 dicitonaries for string and patterns
        dct_p = {}
        dct_s = {}

        # iterate for each letter in pattern and compare with each corresponding word in string
        for idx, p in enumerate(pattern):
            # if letter and pattern are not present in dicitonary then insert their values in dictionary
            if p not in dct_p and strng[idx] not in dct_s:
                dct_p[p] = strng[idx]
                dct_s[strng[idx]] = p
            # if the mapping is present, but the mapping in the striing and pattern is different then return False
            else:
                if p in dct_p and dct_p[p] != strng[idx]:
                    print("1", idx)
                    return False
                elif strng[idx] in dct_s and dct_s[strng[idx]] != p:
                    return False
        return True
