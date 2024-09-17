#time complexity:O(n)
#space complexity:o(1)
#passed all cases on LeetCode: yes

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t): return False
        if not s and not t: return True
        
        sMap = {}
        tset = set()
        
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            
            if sChar in sMap:
                if tChar!= sMap.get(sChar):
                    return False
            else:
                if tChar in tset:
                    return False
            
            sMap[sChar] = tChar
            tset.add(tChar)
            
        return True
        