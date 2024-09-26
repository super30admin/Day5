// Associate S with T and check if a mapping already exists. If it does, confirm the value; if it doesn't match, return False.
// Do same for T with S
// T.C = O(n)
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        s = s.split(' ')

        hashMap1 = {}
        hashMap2 = {}

        if (len(pattern) != len(s)):
            return False

        for i in range (len(pattern)):
            if pattern[i] in hashMap1:
                if hashMap1[pattern[i]] != s[i]:
                    return False
            hashMap1[pattern[i]] = s[i]
            
            if s[i] in hashMap2:
                if hashMap2[s[i]] != pattern[i]:
                    return False
            hashMap2[s[i]] = pattern[i]

        return True
