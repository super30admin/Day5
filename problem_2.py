# runtime : O(n)
# space complexity : O(n)

class solution:
    def __init__(self, s, t):
        self.s = s
        self.t = t
    
    def func(self):
        d_s = {}
        d_t = {}

        if len(self.s) != len(self.t):
            return False

        # in the approach I map the letters from S
        # to letters in T, and the letters in T to the 
        # letters in S. 
        for i in range(len(self.s)):
            # if both the keys don't exist, there's a new combination
            # map them to eachother
            if d_s.get(self.s[i]) == None and d_t.get(self.t[i]) == None:
                d_s[self.s[i]] = self.t[i]
                d_t[self.t[i]] = self.s[i]
            
            # if a pertilar letter in both strings already exists,
            # that means its been mapped to something else earlier.
            # thus return False
            elif self.s[i] not in d_s or self.t[i] not in d_t:
                return False
            
            # return False if the mappings don't match
            elif d_s[self.s[i]] != self.t[i] or d_t[self.t[i]] != self.s[i]:
                return False
        return True

s = "egg"
t = "ada"

new = solution(s, t)
print(new.func())
            