# Time Complexity : O(N), n is the number of letters in input string as lenght will be same
# Space Complexity : O(1), as all are letters so unique are 26 max so linear
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution(object):
    def wordPattern(self, t, s):
        if len(t) != len(s):
            return False
        
        p_hash = {}
        s_hash = {}
        
        for i in range(0, len(t)):
            if t[i] in p_hash:
                if p_hash[t[i]] != s[i]:
                    return False
            else:
                p_hash[t[i]] = s[i]
        
        for j in range(0, len(s)):
            if s[j] in s_hash:
                if s_hash[s[j]] != t[j]:
                    return False
            else:
                s_hash[s[j]] = t[j]
            
        return True