# Time Complexity : O(n * wlen), where wlen is max word length.
# Space Complexity : sc O(n * wlen)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

groupings = defaultdict(list)
for word in strs:
    alphabets = [0] * 26
    for char in word:
        alphabets[ord(char) - ord('a')] += 1
    groupings[tuple(alphabets)].append(word)

return groupings.values()