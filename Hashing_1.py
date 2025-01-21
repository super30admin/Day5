# Problem 1: Group Anagrams
# Approach: Use a hashmap where the sorted version of each string is the key and the value is a list of anagrams. Iterate through the array, sort each string, and add it to the hashmap. Return the values of the hashmap as the grouped anagrams.

def groupAnagrams(strs: List[str]) -> List[List[str]]:
    anagrams = {}
    for s in strs:
        key = ''.join(sorted(s))
        if key not in anagrams:
            anagrams[key] = []
        anagrams[key].append(s)
    return list(anagrams.values())

# Problem 2: Isomorphic Strings
# Approach: Use two hashmaps to maintain mappings between characters in s and t. Iterate through the strings and ensure each character in s maps uniquely to a character in t and vice versa. If the mappings are inconsistent, return false; otherwise, return true.

def isIsomorphic(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False

    s_to_t, t_to_s = {}, {}
    for c1, c2 in zip(s, t):
        if c1 in s_to_t and s_to_t[c1] != c2:
            return False
        if c2 in t_to_s and t_to_s[c2] != c1:
            return False
        s_to_t[c1] = c2
        t_to_s[c2] = c1

    return True

# Problem 3: Word Pattern
# Approach: Use two hashmaps to maintain bijections between the pattern and the words in str. Split str into words and ensure each character in pattern maps uniquely to a word and vice versa. If the mappings are inconsistent or lengths mismatch, return false; otherwise, return true.

def wordPattern(pattern: str, str: str) -> bool:
    words = str.split()
    if len(pattern) != len(words):
        return False

    char_to_word, word_to_char = {}, {}
    for char, word in zip(pattern, words):
        if char in char_to_word and char_to_word[char] != word:
            return False
        if word in word_to_char and word_to_char[word] != char:
            return False
        char_to_word[char] = word
        word_to_char[word] = char

    return True
