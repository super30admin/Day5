# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
from typing import List
def groupAnagrams(strs: List[str]):
    hashMap = {}

    for word in strs:
        sortedWord = ''.join(sorted(word))
        print(sortedWord)
        if sortedWord not in hashMap:
            hashMap[sortedWord] = [word]
            print(hashMap[sortedWord])

        else:
            hashMap[sortedWord].append(word)
            print(hashMap[sortedWord])

    result = []
    for value in hashMap.values():
        result.append(value)
    return result


strs = ["eat","tea","tan","ate","nat","bat"]

# groupAnagrams(strs)
print(groupAnagrams(strs))