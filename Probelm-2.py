class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        #use two hashmaps one for each string to check if they are ismorphic to each other
        map1 ={}
        map2 ={}
        if len(s) != len(t):
            return False

        for i in range(len(s)):
            chs = s[i]
            cht = t[i]
            if chs not in map1:
                map1[chs] = cht
                if cht not in map2:
                    map2[cht] = chs
                else:
                    if map2[cht] != chs:
                        return False
            else:
                if map1[chs]!=cht:
                    return False

        return True
