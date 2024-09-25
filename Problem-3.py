'''
    Time Complexity: O(n)
    Space Complexity: O(1) 26 alphabets
    Approach: Used a hashmap to store the mapping from pattern -> s. 
    Used a hashset to store values if mapped before. 
    If mapped to a different key or value does not match return false. 
'''

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pMap = {}
        pSet = set()
        sWords = s.split(' ')

        if len(pattern) != len(sWords): 
            return False

        for i in range(len(pattern)):
            if pattern[i] not in pMap:
                if sWords[i] in pSet:
                    return False
                else:
                    pMap[pattern[i]] = sWords[i]
                    pSet.add(sWords[i])
            elif pMap[pattern[i]] != sWords[i]:
                return False

        return True