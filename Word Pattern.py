# Time Complexity : O(n + m)
# Space Complexity : O(n + m)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
def wordPattern(pattern,s):
    words = s.split(" ")
    if len(pattern) != len(words):
        return False

    cToW = {}
    wToC = {}
    for c,w in zip(pattern,words):
        if c in cToW and cToW[c] != w:
            return False
        if w in wToC and wToC[w] != c:
            return False
        cToW[c] = w
        wToC[w] = c

    return True

pattern = "abba"
s = "dog cat cat dog"
print(wordPattern(pattern,s))