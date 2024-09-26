class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
    """
    Use two hash maps to map pattern to words, and words to pattern
    """
        hash_mapchtoStr = dict()
        hash_mapstrtoCh = dict()
        
        strs = s.strip().split()
        
        if len(pattern) != len(strs):
            return False
        
        for index in range(len(pattern)):
            if pattern[index] not in hash_mapchtoStr:
                hash_mapchtoStr[pattern[index]] = strs[index]
            else:
                if hash_mapchtoStr[pattern[index]] != strs[index]:
                    return False
            
            if strs[index] not in hash_mapstrtoCh:
                hash_mapstrtoCh[strs[index]] = pattern[index]
            else:
                if hash_mapstrtoCh[strs[index]] != pattern[index]:
                    return False
                
        return True