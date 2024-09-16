class Solution:
    # TC O(n)
    # SC : O(1)
    
    def wordPattern(self, pattern: str, s: str) -> bool:
        if pattern is None or len(pattern) == 0:
            return False
        str_arr = s.split(" ")
        if len(str_arr) != len(pattern):
            return False
        smap ={}
        pmap ={}
        for i in range(len(pattern)):
            if str_arr[i] not in smap:
                smap[str_arr[i]] = pattern[i]
            else:
                if pattern[i] !=  smap[str_arr[i]] :
                    
                    return False
            if pattern[i]  not in pmap:
                pmap[pattern[i]] = str_arr[i]
            else:
                if str_arr[i] != pmap[pattern[i]]:
                  
                    return False
        return True
        
