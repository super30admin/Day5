# Word pattern
# TC : O(n)
# SC : O(2n) 

class Solution:
    def wordPattern(self, pattern: str, s: str):
        s_list = s.split(" ")
        if len(pattern) != len(s_list):
            return False
        hashmap = {}
        hashset = {0}
        i = 0
        while(i <= len(pattern)-1):     
            if pattern[i] in hashmap:
                if hashmap[pattern[i]] != s_list[i]:
                    return False
            elif (pattern[i] not in hashmap):
                if s_list[i] in hashset:
                    return False
                else:
                    hashmap[pattern[i]] = s_list[i]
                    hashset.add(s_list[i])
            i += 1
        return True
                    
                  
        