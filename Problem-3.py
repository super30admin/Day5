class Solution:
    # Time = O(n) time | O(n) Space , where n is the number of character in pattern
    def patternS(self,pattern,string):
        p = [ch for ch in pattern]
        s = string.split(' ')
        if len(p) != len(s):
            return False 
        if len(p) ==0 and len(s) ==0:
            return True 
        d = {}
        for i in range(len(p)):
            if p[i] not in d:
                d[p[i]] = s[i]
            else:
                if d[p[i]] != s[i]:
                    return False
        return True 
    

if __name__ == "__main__":
    s = Solution()
    pattern = "abba"
    string = "dog cat cat dog"
    res = s.patternS(pattern,string) 
    print(res)