class Solution:

    def isIsomorphic(self, s: str, t: str) -> bool:
        dict_str1 = {}
        dict_str2 = {}

        for i, value in enumerate(s):
            dict_str1[value] = dict_str1.get(value, []) + [i]

        for j, value in enumerate(t):
            dict_str2[value] = dict_str2.get(value, []) + [j]

        if sorted(dict_str1.values()) == sorted(dict_str2.values()):
            return True
        else:
            return False



