# Time Complexity: O(N)
# Space Complexity: O(1) as it max can have 26 size even if N is huge
# Executed successfully on Leet code (all test cases passed and accepted)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if len(pattern) != len(s.split(' ')):
            return False
        s = s.split(' ')
        temp_pattern = {}
        temp_s = {}
        
        for i,ele in enumerate(pattern):
            if pattern[i] not in temp_pattern and s[i] not in temp_s:
                temp_pattern[ele] = s[i]
                temp_s[s[i]] = ele
            elif temp_pattern.get(ele) != s[i] or temp_s.get(s[i]) != ele:
                return False
        return True