# Time Complexity : o(mk) + o(nk), m being the length of pattern, n number of words in s, k avg length of all the words in s
# Space Complexity : o(nk)  string to character mapping
# Did this code successfully run on Leetcode : Yes

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s1 = s.split(" ")     #splitting to extract wwords
        if len(s1)!=len(pattern):
            return False
        pmap = {}
        smap = {}
        
        for i in range(len(pattern)):       
            if pattern[i] in pmap:      
                if pmap[pattern[i]] != s1[i]:      # checks if the previously mapped value is equal to current T's value
                    return False
            else:
                if s1[i] in smap:                  # if not seen, checks if the value of string is already mapped to another letter or not
                    if smap[s1[i]] != pattern[i]:
                        return False
                pmap[pattern[i]] = s1[i]
                smap[s1[i]] = pattern[i]
        return True        
                    