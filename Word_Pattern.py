from collections import defaultdict
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict_val = defaultdict()
        s = s.split(" ")
        if len(s) != len(pattern):
            return False
        for index, val in enumerate(pattern):
            if val in dict_val:
                if dict_val[val] != s[index]:
                    return False
            else:
                dict_val[val] = s[index]
        # return True
        dict_val_string = defaultdict()
        # s = s.split(" ")
        for index, val in enumerate(s):
            if val in dict_val_string:
                if dict_val_string[val] != pattern[index]:
                    return False
            else:
                dict_val_string[val] = pattern[index]
        return True
    #Space Complexity: O(N)
    #Time Complexity: O(N)