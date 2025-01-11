class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        map_pattern_to_s = {}
        map_s_to_pattern = {}
        # Edge case: Lengths of pattern and words must match
        if len(pattern) != len(words):
            return False

        for i in range(len(pattern)):
            if (pattern[i] not in map_pattern_to_s) and (words[i] not in map_s_to_pattern):
                map_pattern_to_s[pattern[i]] = words[i]
                map_s_to_pattern[words[i]] = pattern[i]
            elif map_pattern_to_s.get(pattern[i]) != words[i] or map_s_to_pattern.get(words[i]) != pattern[i]:
                return False
        return True
# ----------*********dict.get will not give key error if the key does not exists rather it will give None
        