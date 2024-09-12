class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        Hmap1={}
        Hmap2={}
        
        for i in range(len(s)):
            if s[i] not in Hmap1 and t[i] not in Hmap2:
                Hmap1[s[i]]=t[i]
                Hmap2[t[i]]=s[i]
            
            elif Hmap1.get(s[i])!=t[i]:
                return False
        
        return True

# Time Complexity: O(N)
# Space Complexity: O(K) where K is the number of different words in the dictionary