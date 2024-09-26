class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        p2s = {}
        s2p = {}
        s_split = s.split()
        if len(s_split) != len(pattern): return False
        for i in range(len(pattern)):
            if pattern[i] in p2s:
                if p2s[pattern[i]] != s_split[i]:
                    return False
            elif s_split[i] in s2p:
                if s2p[s_split[i]] != pattern[i]:
                    return False
            else:
                p2s[pattern[i]] = s_split[i]
                s2p[s_split[i]] = pattern[i]
        return True


#Time complexity would be O(n) where n is the size of the string s. We are iterating over the entire sting while splitting.
#Space complexity would be O(1) since the max size of the hashmap will be 26. 