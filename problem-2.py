#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dictionary = {}
        t_seen = []
        for i in range(0, len(s)):
            if t[i] not in t_seen:
                t_seen.append(t[i])
                if s[i] not in dictionary:
                    dictionary[s[i]] = t[i]
                else:
                    if dictionary[s[i]] != t[i]:
                        return False
            else:
                if s[i] in dictionary and dictionary[s[i]] == t[i]:
                    continue
                else:
                    return False
        return True