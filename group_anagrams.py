# Approach: Words are anagrams of each other, if when they are sorted are equal to each other
# Time Complexity: O( M * N log(N)) where M is the number of words in the string and we perform sorting of these N length words
# Space Complexity: O(M * N) where M is the total number of words in the string and each of length N
# Successfully ran on leetcode
# Brute Force: I would have attempted the following as BR solution too
def groupAnagrams(strs):
    anagrams = {}

    for word in strs:
        sortedWord = "".join(sorted(word))
        if sortedWord in anagrams:
            anagrams[sortedWord].append(word)
        else:
            anagrams[sortedWord] = [word]

    return list(anagrams.values())