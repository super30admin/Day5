#time complexity = O(n)
#space complexity = O(n)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hash1 = {}  # create hashmap
        hash2 = {}  # create hashmap
        for i in range(len(s)):
            c1 = s[i]   # assign c1 for all char in str s
            c2 = t[i]   # assign c2 for all char in str t
            if ((c1 in hash1 and hash1[c1] != c2) or (c2 in hash2 and hash2[c2] != c1)):  # check if c1 and c2 are in hash 1 and hash2 respectively and c1 in hash1 shoudl be equal to c2 and vice a versa
                return False
            hash1[c1] = c2  # assign c1 in hash1 to c2
            hash2[c2] = c1  # assign c2 in hash1 to c1
            
        return True