'''
Using 2 hashmaps
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_map={}
        t_map={}
        for i,ch in enumerate(s):
            if ch in s_map:
                if s_map[ch]!=t[i]:
                    return False
            else:
                s_map[ch]=t[i]
            if s_map[ch] in t_map:
                if t_map[t[i]]!=ch:
                    return False
            else:
                t_map[t[i]]=ch
        return True
'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_map={}
        t_map=set()
        for i,ch in enumerate(s):
            if ch in s_map:
                if s_map[ch] != t[i]:
                    return False
            else:
                s_map[ch]=t[i]
                if t[i] in t_map:
                    return False
                t_map.add(t[i])
            
        return True