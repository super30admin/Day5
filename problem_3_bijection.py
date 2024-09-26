# Spcce Complexity: O(1)
# Time Complexity: O(n)
class Solution(object):
    def wordPattern(self, pattern, s):
        #Splitting basic string into list of words
        s = s.split()
        s_len = len(s)
        p_len = len(pattern)
        hash_map = {}
        hash_set = set()

        #          checking lengths of two comparing strings
        if s_len != p_len:
            return False

        for i in range(s_len):
            #Checking if value is present in hasset and if then comparing the key valur pair in hasmap
            # and decide accordingly

            if pattern[i] in hash_set and s[i] in hash_map and hash_map[s[i]] != pattern[i]:
                return False
            elif pattern[i] not in hash_set and s[i] in hash_map and hash_map[s[i]] != pattern[i]:
                return False
            elif pattern[i] not in hash_set and s[i] not in hash_map:
                hash_map[s[i]] = pattern[i]
                hash_set.add(pattern[i])
            elif pattern[i] in hash_set and s[i] not in hash_map:
                return False

        return True
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
