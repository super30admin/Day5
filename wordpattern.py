# Time Complexity : O(N) Iterate over the input 'pattern' once of length N
# Space Complexity : O(M) where M is the size of array sArray, string "s" split and saved in array for processing
# 290. Word Pattern


def wordPattern(pattern: str, s: str) -> bool:
    sArray = s.split()
    if len(pattern) != len(sArray): return False
    patternMap = {}
    sMap = set()
    for i in range(len(pattern)):
        if pattern[i] not in patternMap and sArray[i] not in sMap:
            patternMap[pattern[i]] = sArray[i]
            sMap.add(sArray[i])
        elif pattern[i] in patternMap and sArray[i] in sMap:
            if patternMap[pattern[i]] != sArray[i]:
                return False
        else:
            return False
    return True

print(wordPattern("abba", "dog cat cat dog"))
print(wordPattern("abba", "dog cat cat fish"))
