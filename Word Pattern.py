class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        map_char = {}
        map_word = {}

        words = s.split(' ')
        if len(words) != len(pattern):
            return False

        for c, w in zip(pattern, words):
            if c not in map_char:
                if w in map_word:
                    return False
                else:
                    map_char[c] = w
                    map_word[w] = c
            else:
                if map_char[c] != w:
                    return False
        return True

    """
    Time Complexity: O(N), where N is number of wrods in s
    Space Complexity: O(M), where M is number of unique words in s
    """