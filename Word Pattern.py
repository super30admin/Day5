# Time: O(N) | Space: O(M)
# Where N is words in w or characters in pattern
# M is unique characters in pattern
# Single Index Hashmap

class Solution:
    def wordPattern(self, pattern, s):
        map_index = {}
        words = s.split()

        if len(pattern) != len(words):
            return False

        for i in range(len(words)):
            c = pattern[i]
            w = words[i]

            char_key = 'char_{}'.format(c)
            char_word = 'word_{}'.format(w)

            if char_key not in map_index:
                map_index[char_key] = i

            if char_word not in map_index:
                map_index[char_word] = i

            if map_index[char_key] != map_index[char_word]:
                return False

        return True



if __name__ == "__main__":
    print(Solution().wordPattern("abba", "dog cat cat dog"))
    print(Solution().wordPattern("abba", "dog cat cat cat"))