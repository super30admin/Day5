 def wordPattern(pattern: str, s: str) -> bool:
    # Time Complexity: O(n), where n is the length of the pattern string or the number of words in s
    # Space Complexity: O(1), In the worst case all 27 characters are encoded. Constant in asymptotic sense
    arr = s.split(' ')
    if len(arr) != len(pattern):
        return False
    pattern_to_word_dict = {}
    word_to_pattern_dict = {}
    for pat, word in zip(pattern, arr):
        if pat in pattern_to_word_dict and pattern_to_word_dict[pat] != word:
            # We have it assigned to a different word. Therefore we return false
            return False
        else:
            if pat not in pattern_to_word_dict:
                # Some other pattern already encodes word, return false
                if word in word_to_pattern_dict and word_to_pattern_dict[word] != pat:
                    return False
                pattern_to_word_dict[pat] = word
                word_to_pattern_dict[word] = pat
    return True

print(wordPattern('abba', 'dog cat cat dog'))
print(wordPattern('abba', 'dog cat cat fish'))