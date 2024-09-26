#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(" ")
        if len(pattern) != len(s):
            return False
        dic = {}
        for i in range(len(pattern)):
            if pattern[i] not in dic and s[i] not in dic.values():
                dic[pattern[i]] = s[i]
            else:
                if pattern[i] in dic:
                    if s[i] != dic[pattern[i]]:
                        return False
                else:
                    return False
        return True