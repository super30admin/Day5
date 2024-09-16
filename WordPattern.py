# Time complexity: O(N) ; No. of words in s or pattern
# Space complexity: O(M) ; No. of unique words in s
# Approach: I store pattern to word mapping in hashmap, and set to store unique words. if pattern[i] not in hashmap keys, add it, then check if word is already in set or not, if yes means it has ocurred before and return False, otherwise add it. if pattern already in map, then check if its value matches current value of word. If not return False. Return True if we get out of for loop.
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        sList = s.split()
        if len(sList) != len(pattern):
            return False
        dic = {}
        sSet = set()
        for i in range(len(sList)):
            if pattern[i] not in dic.keys():
                dic[pattern[i]] = sList[i]
                
                if sList[i] not in sSet:
                    sSet.add(sList[i])
                else:
                    return False
            else:
                if dic[pattern[i]] != sList[i]:
                    return False
                
        return True