class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        n = len(s)
        m = len(t)
        if n != m:
            return False
        dic = {}
        for i in range(n):
            print("dic",dic)
            if s[i] in dic:
                print("s[i]",s[i])
                if dic[s[i]] != t[i]:
                    print("dic[s[i]]:",dic[s[i]],"t[i]:",t[i])
                    return False
            elif t[i] in dic.values():
                print("t[i]:",t[i])
                return False
            else:
                dic[s[i]] = t[i]
        return True


# time complexity = O(N) and space complexity = O(1)
