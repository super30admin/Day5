# Time Complexity = O(n)   Space Complexity = O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        strings = s.split()
        if len(pattern) != len(strings):
            return False

        hash_map1 = {}
        hash_map2 = {}

        for i in range(len(pattern)):
            if pattern[i] not in hash_map1:
                hash_map1[pattern[i]] = strings[i]
            else:
                if hash_map1[pattern[i]] != strings[i]:
                    return False

            if strings[i] not in hash_map2:
                hash_map2[strings[i]] = pattern[i]
            else:
                if hash_map2[strings[i]] != pattern[i]:
                    return False

        return True
