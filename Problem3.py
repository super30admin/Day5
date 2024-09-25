#Time Complexity - O(N)
# Explanation:
# 1. Map S to T and check if a mapping already exists. If it exists, verify the value; if it doesn't match, return False.
# 2. Do the same for T to S mapping.

#Code
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        s = s.split(' ')
        hash_table1 = {}
        hash_table2 = {}

        if(len(pattern) != len(s)):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] in hash_table1:
                if hash_table1[pattern[i]] != s[i]:
                    return False
            hash_table1[pattern[i]] = s[i]

            if s[i] in hash_table2:
                if hash_table2[s[i]] != pattern[i]:
                    return False
            hash_table2[s[i]] = pattern[i]
        return True

        