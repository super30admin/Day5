class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        Hmap={}
        word_list=s.split()
        
        if len(pattern)!=len(word_list):
            return False
        
        for i in range(len(word_list)):
            if pattern[i] not in Hmap:
                if word_list[i] in Hmap.values():
                    return False
                
                Hmap[pattern[i]]=word_list[i]
                
    
            elif pattern[i] in Hmap and Hmap[pattern[i]]!=word_list[i]:
                return False
        return True
        

# Time Complexity: O(n)
# Space Complexity: O(k) where k is the length of the pattern