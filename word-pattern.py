# Time Complexity : O(n) - n is length of pattern or no. of words in s
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
I will maintain two dictionaries:
First one for mapping of character in pattern to word in s
Second one for mapping of word in s to character in pattern

Same logic as isomorphic strings
"""
def wordPattern(pattern, s):
    words = s.split(' ')
    if len(pattern) != len(words):
        return False

    dict_pattern = {}
    dict_words = {}

    for i in range(0, len(pattern)):
        if pattern[i] not in dict_pattern:
            dict_pattern[pattern[i]] = words[i]
        elif dict_pattern[pattern[i]] != words[i]:
            return False

        if words[i] not in dict_words:
            dict_words[words[i]] = pattern[i]
        elif dict_words[words[i]] != pattern[i]:
            return False
    return True








