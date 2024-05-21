# Time Complexity : O(n), where n is the size of the string
# Space Complexity : O(1)
# This function checks if two strings s and t are isomorphic by using a dictionary to map characters from s to t and vice versa. It ensures each character in s consistently maps to a unique character in t and vice versa. If any character mapping conflicts are found, it returns False. Otherwise, it returns True.
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if s is None or t is None or len(s) != len(t):
            return False
        
        mapping = {}
        for i in range(len(s)):
            s_char = s[i] + '1'
            t_char = t[i] + '2'
            if s_char in mapping:
                if mapping[s_char] != t_char:
                    return False
            else:
                if t_char in mapping:
                    return False
                mapping[s_char] = t_char
                mapping[t_char] = s_char
        
        return True

# Example 1
solution = Solution()
s = "egg"
t = "add"
print(solution.isIsomorphic(s, t))  # Output: True

# Example 2
s = "foo"
t = "bar"
print(solution.isIsomorphic(s, t))  # Output: False

# Example 2
s = "paper"
t = "title"
print(solution.isIsomorphic(s, t))  # Output: True