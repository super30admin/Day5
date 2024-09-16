'''
290. WORD PATTERN
TIME COMPLEXITY: O(N)
SPACE COMPLEXITY: O(N)
LEETCODE: YES
ANY DIFFICULTIES: my brain took a while took a while to use two maps
'''

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(' ')
        if len(pattern) != len(s):
            return False
        
        '''
        use two maps
        pattern mapping to s with an identifier
        s mapping to pattern with an identifier
        '''
        
        a = {pattern[0]:0}
        r_a = {s[0]:0}
        idx = 1
        for char, word in zip(pattern, s):
            # Dont return false if char and word are in a and r_a respectively and both have the same value.
            if char in a.keys() and word not in r_a.keys():
                return False
            elif word in r_a.keys() and char not in a.keys():
                return False
            elif word in r_a.keys() and char in a.keys() and a[char] != r_a[word]:
                return False
            if char not in a.keys():
                a[char] = idx
                r_a[word] = idx
                idx += 1
        
        return True        
        
