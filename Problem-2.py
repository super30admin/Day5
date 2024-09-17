# Time-complexity: O(n)
# Space-complexity: O(n)
# Solved in Leetcode: yes
# Difficult? No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        i = 0
        tset = set()
        dic = {}
        while(i<len(s)):
            if s[i] not in dic:
                if t[i] in tset: return False
                else:
                    dic[s[i]] = t[i]
                    tset.add(t[i])
            else:
                if t[i] != dic[s[i]]: return False
            i += 1
        return True

obj = Solution()
print(obj.isIsomorphic("egg","add"))