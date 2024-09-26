# Space Complexity: O(1)
#  Time Complexity: O(n)

class Solution(object):
    def isIsomorphic(self, s, t):

        s_len = len(s)
        t_len = len(t)
        hash_map = {}
        hash_set = set()
        #checking lengths of two comparing strings
        if s_len != t_len:
            return False

        for i in range(s_len):
            #Checking if value is present in hasset and if then comparing the key valur pair in hasmap
            # and decide accordingly

            if t[i] in hash_set and s[i] in hash_map and hash_map[s[i]] != t[i]:
                return False
            elif t[i] not in hash_set and s[i] in hash_map and hash_map[s[i]] != t[i]:
                return False
            elif t[i] not in hash_set and s[i] not in hash_map:
                hash_map[s[i]] = t[i]
                hash_set.add(t[i])
            elif t[i] in hash_set and s[i] not in hash_map:
                return False

        return True
