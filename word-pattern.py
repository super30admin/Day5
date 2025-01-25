# Time Complexity : O(len(n + m)), where n and m are length of pattern and s, respt.
# Space Complexity : O(m)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


words = s.split()
if len(pattern) != len(words):
    return False

values = set()
word_char_map = {}
string_idx = 0

for char in pattern:
    if char in word_char_map:
        if word_char_map[char] != words[string_idx]:
            return False
    else:
        if words[string_idx] in values:
            return False
        word_char_map[char] = words[string_idx]
        values.add(words[string_idx])
    string_idx += 1

return True