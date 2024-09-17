# Time-complexity: O(n)
# Space-complexity: O(n)
# Solved in Leetcode: yes
# Difficult? No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        i = 0
        dic = {}
        words = s.split()
        if len(pattern) != len(words): return False
        s_set = set()
        while i<len(pattern):
            if pattern[i] not in dic:
                if words[i] in s_set: return False
                s_set.add(words[i])
                dic[pattern[i]] = words[i]
            else:
                if words[i] != dic[pattern[i]]: return False
            i += 1
        return True

obj = Solution()
print(obj.wordPattern("abba","dog cat cat dog"))