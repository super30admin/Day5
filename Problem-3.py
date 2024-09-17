class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(' ')
        
        if len(words) != len(pattern):
            return False
        
        d = {}
        
        for x in range(len(words)):
            if pattern[x] not in d:
                if words[x] in d.values():
                    return False
                d[pattern[x]] = words[x]
            else:
                if d[pattern[x]] != words[x]:
                    return False
        return True


# splitting the sentence into the words and then iterating through the word list and checking if the key is already presenting in the dictionary. If its present will return False, otherwise its True.
# time complexity - O(N) and space complexity - O(1)
