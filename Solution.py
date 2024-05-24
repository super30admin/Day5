#Problem 1
class Solution:
    def groupAnagrams(self, strs):
        # Use the sorted version of each word as a key to group anagrams in a dictionary.
        # This method ensures that words which are anagrams will be grouped under the same key.
        # Return the groups of anagrams collected from the dictionary.

        anagram_map = defaultdict(list)
        
        for word in strs:
            sorted_word = ''.join(sorted(word))
            anagram_map[sorted_word].append(word)
        
        return list(anagram_map.values())

#Problem 2
class Solution(object):
    def isIsomorphic(self, s, t):
        # Map characters of both strings to their first occurrence index.
        # Compare the patterns formed by these indices to determine if the strings are isomorphic.
        # This approach ensures that the relative character positions match between the two strings.

        map1 = []
        map2 = []
        for idx in s:
            map1.append(s.index(idx))
        for idx in t:
            map2.append(t.index(idx))
        return map1 == map2

#Problem 3
class Solution:
    def wordPattern(self, p: str, s: str) -> bool:
        # Check if the pattern p matches the sequence of words in s.
        # Use two dictionaries to ensure a one-to-one mapping between words and pattern characters.
        # Return False if any word or character mapping violates the pattern.

        words = s.split(' ')
        w_to_p = dict()
        p_to_w = dict()
        
        if len(p) != len(words):
            return False
        
        for i in range(len(words)):
            word = words[i]
            pattern_char = p[i]
            
            if word not in w_to_p and pattern_char not in p_to_w:
                w_to_p[word] = pattern_char
                p_to_w[pattern_char] = word
            elif w_to_p.get(word) != pattern_char or p_to_w.get(pattern_char) != word:
                return False
        
        return True
