# O(min(n,m)) time where n is len(pattern) and m is len(s)
# O(n + m) space
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_list = s.split(" ")
        hash_table = {}
        used_keys = {}
        i = 0
        j = 0
        while i < len(pattern) and j < len(s_list):
            if pattern[i] not in hash_table:
                if s_list[j] in used_keys:
                    return False
                hash_table[pattern[i]] = s_list[j]
                used_keys[s_list[j]] = True
            else:
                if hash_table[pattern[i]] != s_list[j]:
                    return False
            i += 1
            j += 1
        return False if i < len(pattern) or j < len(s_list) else True


s = Solution()
print(s.wordPattern("abba","a a a a"))