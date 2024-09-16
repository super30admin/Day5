class Solution:
    # Time = O(n) | O(1) Space, where n is the number of characters in s
    def isomorphic(self,s,t):
        if len(s) != len(t):
            return False
        if len(s)==0 and len(t)==0:
            return True
        d = {}
        for i in range(len(s)):
            if s[i] not in d:
                d[s[i]] = t[i]
            else:
                if d[s[i]] != t[i]:
                    return False
        return True  
                
if __name__ == "__main__":
    s = "add"
    t = "egg"
    si = Solution()
    res = si.isomorphic(s,t)
    print(res)
    