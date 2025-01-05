class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_lst = s.split(" ")
        if len(pattern)!=len(s_lst):
            return False
        hashmap = {}
        hashset = set()

        for i,ch in enumerate(pattern):
            if ch not in hashmap:
                hashmap[ch] = s_lst[i]
                if s_lst[i] in hashset:
                    return False
                hashset.add(s_lst[i])
            else:
                if hashmap[ch] != s_lst[i]:
                    return False
        return True
        