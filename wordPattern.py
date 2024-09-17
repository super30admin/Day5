# TC and SC: Both solutions have linear time O(n) and space of O(n) as well

# https://leetcode.com/problems/word-pattern/
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # hashmap solution - 2 hashmaps
        if len(pattern) != len(s.split()):
            return False
        s = s.split()
        p = pattern  # unnecessary but I did it just to shorten var name
        
        # pmap, smap = {},{}
        # for i in range(len(pattern)):
        #     if p[i] not in pmap:
        #         pmap[p[i]] = s[i]
        #         if s[i] not in smap:
        #             smap[s[i]] = p[i]
        #         else:
        #             if smap[s[i]] != p[i]:
        #                 return False
        #     else:
        #         if pmap[p[i]] != s[i]:
        #             return False
        # return True
        
        # hashmap solution - 1 hashmaps
        mp = {}
        # for each char in pattern and word in string s add both in the mp map
        # if pattern char or string already in map with different index then return False
        for i in range(len(pattern)):
            char_p = "char_{}".format(p[i])
            char_w = "word_{}".format(s[i])
            if char_p not in mp:
                mp[char_p] = i
            if char_w not in mp:
                mp[char_w] = i
            if mp[char_p] != mp[char_w]:
                return False
            
        return True