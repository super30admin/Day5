class Solution:
    def wordPattern(self, pattern, s):
        words = s.split()
        if len(words) != len(pattern):
            return False
        
        d = {}
        for i, j in zip(pattern, words):
            d[i] = j
            
        if len(set(d.values())) != len(d.values()):
            return False
        
        ans = ""
        for i in pattern:
            ans += d[i]
            
        match = ""
        for i in words:
            match += i
        
        if ans == match:
            return True
        return False
            
sol = Solution()
pattern = "abba"
s = "dog cat cat dog"
print(sol.wordPattern(pattern, s))

# TC: O(N)
# SC: O(N)
