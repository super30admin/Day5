# Time Complexity: O(n)
# Space Complexity: O(n)
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        s = s.split(' ')
        visited = []
        if len(pattern) != len(s):
            return False
        dic = {}
        for i in range(len(pattern)):
            if pattern[i] not in dic and s[i] not in visited:
                dic[pattern[i]] = s[i]
                visited.append(s[i])
            elif pattern[i] not in dic and s[i] in visited:
                return False
            else:
                if dic[pattern[i]] != s[i]:
                    return False
        return True
        
