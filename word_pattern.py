class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # Time Complexity: O(N)
        # Space Complexity: O(N)    
            
        s_map={}
        pattern_map={}
        pattern_check=[]
        s_check=[]
        for index,ch in enumerate(pattern):
            if ch not in pattern_map:
                pattern_map[ch]=index
            pattern_check.append(pattern_map[ch])
        
        for index,ch in enumerate(s.split()):
            if ch not in s_map:
                s_map[ch]=index
            s_check.append(s_map[ch])
        
        return s_check==pattern_check
        
        