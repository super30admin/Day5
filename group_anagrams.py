# Time compleixty: O(n k log k), k-avg size of each word, n is no.of.words.
# Space complexity: O(n)
# Approach: sort the words and keep sorted words as key and values as the unsorted string in a hashmap.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = dict()
        for word in strs:
            sorted_word = ''.join(sorted(word))
            print(sorted_word)
            if sorted_word not in hashmap:
                hashmap[sorted_word] = []
            hashmap[sorted_word].append(word)
        return hashmap.values()
            
        