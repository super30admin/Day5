# Time Complexity = O(n)   Space Complexity = O(n)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map1 = {}
        map2 = {}
        l1 = s.split(' ')
        if len(pattern) != len(l1):
            return False
        # print(l1)
        for i in range(len(pattern)):
            sCh = l1[i]
            patCh = pattern[i]
            if patCh not in map1:
                map1[patCh] = sCh
            elif map1[patCh] != sCh:
                return False
            if sCh not in map2:
                map2[sCh] = patCh
            elif map2[sCh] != patCh:
                return False
        return True
