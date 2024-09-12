#Used an approach very similar to problem_2

class solution:
    def __init__(self, pattern, string):
        self.pattern = pattern
        self.string = string.split()
    
    def func(self):
        d_s = {}
        d_p = {}

        if len(self.pattern) != len(self.string):
            return False

        for i in range(len(self.string)):
            # print(d_s, d_p)
            if d_s.get(self.string[i]) == None and d_p.get(self.pattern[i]) == None:
                d_s[self.string[i]] = self.pattern[i]
                d_p[self.pattern[i]] = self.string[i]

            elif self.string[i] not in d_s or self.pattern[i] not in d_p:
                return False
            elif d_s[self.string[i]] != self.pattern[i] or d_p[self.pattern[i]] != self.string[i]:
                return False
            # print(d_s, d_p)
        return True

pattern = "abba"
string = "dog cat cat dog"
new = solution(pattern , string)
print(new.func())