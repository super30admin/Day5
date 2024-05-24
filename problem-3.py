# Time Complexity
# O(n)
# Space Complexity
# O(1)

# Approach :
# assgin each character a word
# each word is assigned in a hash set.
# if a character isnt assigned assign it a character only if the word is mapped to any other character
# if a word is already associated with a character and another character is using this word, return false


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        lenPattern = len(pattern)
        splittedArr = s.split(" ")

        if lenPattern != len(splittedArr):
            return False

        patternHashmap = {}
        sHashSet = set()

        for i in range(lenPattern):

            if pattern[i] not in patternHashmap:
                if splittedArr[i] in sHashSet:
                    return False
                patternHashmap[pattern[i]] = splittedArr[i]

            else:
                if (patternHashmap[pattern[i]] != splittedArr[i]):
                    return False

            if splittedArr[i] not in sHashSet:
                sHashSet.add(splittedArr[i])

        return True
