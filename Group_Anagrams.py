from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        ### Approach: Generate Key using property of prime numbers
        primes = [2,3,5,7,11,13,17,19,23,29,31,37,43,41,47,53,59,61,67,71,73,79,83,89,97,101]
        
        def compute_hash(string):
            hash_val = 1
            for char in string:
                hash_val *= primes[ord(char) - ord('a')]
            return hash_val

        ### Approach 1: Generating Key by sorting
        g_map = defaultdict(list)
        
        ### For word in given words
        for word in strs:
            # Get a unique key based on chars and group them together
            key = compute_hash(word)        # Approach_1: Computing Hash using property of prime numbers
            # key = "".join(sorted(word))   # Approach_2: Generating Key through sorting chars
            g_map[key].append(word)
        
        return list(g_map.values())

### Complexity Analysis

# Time Complexity: O(NK) --> N = number of words (For-loop Iteration), K = Average Length of word (Computing Hash)
# Space Complexity: O(NK) --> Hash Map