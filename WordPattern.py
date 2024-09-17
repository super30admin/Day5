#time complexity:O(n)
#space complexity:o(1)
#passed all cases on LeetCode: yes

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        pMap = {}
        sSet = set()
        s = s.split(" ")
        for i in range(len(pattern)):
            print(pattern[i])
            if pattern[i] in pMap:
                if s[i]!= pMap.get(pattern[i]):
                    return False
            
            else:
                if s[i] in sSet:
                     return False
            
            pMap[pattern[i]] = s[i]
            sSet.add(s[i])
        return True
        