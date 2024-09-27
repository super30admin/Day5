#Time Complexity - O(n) 
#Space Complexity - O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict_p = {}
        dict_s = {}
        string = s.split(" ")
        if len(pattern) != len(string):
            return False
        for x, y in zip(pattern, string):
            if x not in dict_p and y not in dict_s:
                dict_p[x] = y
                dict_s[y] = x
            elif dict_p.get(x) != y or dict_s.get(y) != x:
                return False
        return True