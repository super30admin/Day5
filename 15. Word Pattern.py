# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word_split_arr = s.split(" ")
        if len(pattern) != len(word_split_arr): return False
        hash_map = {}
        for i in range(0,len(pattern)):
            if pattern[i] not in hash_map:
                if word_split_arr[i] not in hash_map.values():
                    hash_map[pattern[i]] = word_split_arr[i]
                else: return False
            else:
                if hash_map[pattern[i]] != word_split_arr[i]:
                    return False
        return True