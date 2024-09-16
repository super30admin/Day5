class Solution:
    def wordPattern(self, pattern, s):
        map_index = {}
        words = s.split()

        if len(pattern) != len(words):
            return False

        '''
        take single chatacter from pattern and single string from s
        have a map to maintain its index 
        check for every corresponding occurrence, if the index of the map maintained is equal.
        
        If not true, anywhere return False immediately
        else, return True after completing iteration of complete array
        '''
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

word_pattern = Solution()
print(word_pattern.wordPattern("abba","dog cat cat dog"))

'''
Time Complexity - O(N) N number of set elements in an pattern string
Space Complexity - O(N) N number of set elements in a pattern string
'''