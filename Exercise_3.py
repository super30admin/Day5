
class Solution:
    """
    Two Hashmaps Approach
    trick - simply store one to one relation in two hashmaps both ways
    TC - On
    SC - On
    """

    def approach1(self, pattern: str, s) -> bool:
        smap, pmap = dict(), dict()
        for i in range(len(pattern)):
            pchar = pattern[i]
            schar = s[i]
            if (schar in smap and smap[schar] != pchar) or (pchar in pmap and pmap[pchar] != schar):
                return False
            smap[schar] = pchar
            pmap[pchar] = schar
        return True

    """
    One Hashmaps Approach
    trick - simply store one to one relation in a hashmaps and check if word was already mapped
    TC - On with O1 checking
    SC - On
    """

    def approach2(self, pattern: str, s) -> bool:
        hp = dict()
        for i in range(len(pattern)):
            pchar = pattern[i]
            schar = s[i]
            if (pchar in hp and hp[pchar] != schar) or (schar in hp.values() and pchar not in hp):
                return False
            hp[pchar] = schar
        return True

    def wordPattern(self, pattern: str, s: str) -> bool:
        slist = s.split(" ")
        if len(pattern) != len(slist) or pattern is None or len(pattern) == 0:
            return False
        # return self.approach1(pattern,slist)
        return self.approach2(pattern, slist)