# TC: O(4n) for split(),set()*2, words[] = O(n)
# SC: O(n) worst case all words are unique
# LC: YES

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hashmap = {}
        words = s.split()
        p = pattern # too lazy to rename p
        if len(p) != len(words): return False   
        if len(set(p)) != len(set(words)): return False
        for i in range(len(words)):
            if words[i] not in hashmap:
                hashmap[words[i]] = p[i]
            elif hashmap[words[i]] != p[i]:
                return False
        return True       