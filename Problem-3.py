class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        s =s.split()
        if len(pattern)!= len(s):
            return False

        map1={}
        map2={}

        for i in range(len(s)):

            chp = pattern[i]
            chs = s[i]
            if chs not in map1:
                map1[chs] = chp
                if chp not in map2:
                    map2[chp] = chs
                else:
                    if map2[chp] != chs:
                        return False
            else:
                if map1[chs]!=chp:
                    return False

        return True
            
