# Time complexity - O(n+m) where n is number of symbols in pattern and m is total number of symbols in s
# Space Complexity - O(k) where k is the total length of all unique words
# Executed in leetcode - yes

class Solution(object):
    def wordPattern(self, pattern, s):
        s_list = s.split()
        if len(pattern) != len(s_list):
            return False
        
        p_hash = {}
        s_hash = {}
        
        for i in range(0, len(pattern)):
            if pattern[i] in p_hash:
                if p_hash[pattern[i]] != s_list[i]:
                    return False
            else:
                p_hash[pattern[i]] = s_list[i]
        
        for j in range(0, len(s_list)):
            if s_list[j] in s_hash:
                if s_hash[s_list[j]] != pattern[j]:
                    return False
            else:
                s_hash[s_list[j]] = pattern[j]
            
        return True