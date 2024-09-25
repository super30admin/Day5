#Time Complexity = O(N)
# Explanation:
# 1. Map S to T and check if a mapping already exists. If it exists, verify the value; if it doesn't match, return False.
# 2. Do the same for T to S mapping.



#Code
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        hash_table1 = {}
        hash_table2 = {}

        for i in range(len(s)):
            print(s[i])
            print(t[i])
            if s[i] in hash_table1:
                if hash_table1[s[i]]!=t[i]:
                    return False
            hash_table1[s[i]] = t[i]

            if t[i] in hash_table2:
                if hash_table2[t[i]]!=s[i]:
                    return False
            hash_table2[t[i]] = s[i]
        return True