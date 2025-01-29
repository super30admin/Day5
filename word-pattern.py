# We check if the number of unique characters in pattern, words in s, and their mappings (using zip_longest) are all equal, 
# ensuring a one-to-one correspondence.
# Time Complexity: O(N), where N is the length of pattern or s (whichever is longer), as we iterate through both once.
# Space Complexity:O(N) for storing unique mappings in sets.
class Solution:
    def wordPattern(self, p: str, s: str) -> bool:
        s = s.split()
        return (len(set(s)) == len(set(p)) == len(set(zip_longest(p, s))))