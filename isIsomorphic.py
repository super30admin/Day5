class Solution:
    def has_key(self, hashMap, key):
        if key in hashMap.keys():
            return True
        return False
    
    def isIsomorphic(self, s, t):
        if not s and not t:
            return True
        if len(s) != len(t):
            return False
        
        sMap = {}
        tMap = {}
        
        for i, j in zip(s,t):
            if not self.has_key(sMap, i):
                sMap[i] = j
            if not self.has_key(tMap, j):
                tMap[j] = i
                
            if (sMap[i] != j or tMap[j] != i):
                return False
        
        return True

s = Solution()
s.isIsomorphic('egg', 'add')

# TC: O(N)
# SC: O(1)
