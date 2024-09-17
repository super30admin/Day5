class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        mps={}
        mpt={}
        
        s=s.split(" ")
        if len(pattern)!=len(s):
            return False
       
        for i in range(len(pattern)):
            if pattern[i] in mps:
                if mps[pattern[i]]!=s[i]:
                    return False
            else:
                mps[pattern[i]]=s[i]
            if s[i] in mpt:
                if mpt[s[i]]!=pattern[i]:
                    return False
            else:
                mpt[s[i]]=pattern[i]
        return True
#same as isomorphic strings
#O(N)>>traverse map
#O(1+m)>> store at max 26 lowercase alphabets that means O(26)+words depends on input string lengths