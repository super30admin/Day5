"""
Word Pattern - https://leetcode.com/problems/word-pattern/description/
Approach HashMap and Hash set-
TC - O(n) ==>  number of characters in a string s
SC - O(n) ==> number of words in s
"""

pattern1 = "abba"
s1 = "dog cat cat dog"


def wordPattern(pattern, s):
    if pattern is None or s is None: return False
    if pattern is None and s is None: return True

    sList = s.split()
    # print(sList)

    if len(pattern) != len(sList): return False

    # declare DS
    patternMap = {}
    sSet = set()

    for i in range(len(pattern)):
        if pattern[i] not in patternMap:
            patternMap[pattern[i]] = sList[i]
        if pattern[i] in patternMap and patternMap[pattern[i]] != sList[i]: return False

    for i in range(len(sList)):
        sSet.add(sList[i])

    if len(patternMap) != len(sSet): return False

    return True


if __name__ == '__main__':
    print(wordPattern(pattern1, s1))
