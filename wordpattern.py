def wordPattern(pattern, s):
    words = s.split()
    Map = {}
    wordsSet = set()
        
    if len(words) != len(pattern):
        return False
    
    for i in range(len(pattern)):
        if pattern[i] not in Map:
            if words[i] in wordsSet:
                return False
            Map[pattern[i]] = words[i]
            wordsSet.add(words[i])
        if Map[pattern[i]] != words[i]:
            return False
    
    return True

print(wordPattern("abba", "dog cat cat dog"))
print(wordPattern("boba", "dog cat dog cat"))
print(wordPattern("", ""))

