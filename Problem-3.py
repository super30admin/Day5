# Word Pattern

# Time Complexity: O(N)
# Space Complexity: O(M), where M is number of unique letters in `s` (also, unique words in `pattern`)
# Did it run on Leetcode:  Yes
# Any problems: N/A

def wordPattern(self, pattern: str, s: str) -> bool:
    s = s.split()
    if len(s) != len(pattern):
        return False
    
    s_to_p = {}
    p_to_s = {}
    for p1, s1 in zip(pattern, s):
        if s1 not in s_to_p and p1 not in p_to_s:
            s_to_p[s1] = p1
            p_to_s[p1] = s1
        
        elif s1 in s_to_p and p1 in p_to_s and \
            s_to_p[s1] == p1 and p_to_s[p1] == s1:
            continue
        
        else:
            return False
    return True
