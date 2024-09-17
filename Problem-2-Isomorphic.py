class Solution:
    def isIsomorphic(self, s, t) :
        hashmap1 = {}
        hashmap2 = {}
        length = len(s)
        for i in range(length):
            if s[i] not in hashmap1.keys():
                hashmap1.update({s[i]: t[i]})
            else:
                if hashmap1[s[i]] != t[i]:
                    return False
        for j in range(length):
            if t[j] not in hashmap2.keys():
                hashmap2.update({t[j]: s[j]})
            else:
                if hashmap2[t[j]] != s[j]:
                    return False

        print(hashmap1)
        print(hashmap2)
        return True

sol = Solution()
arr1 = ["add"]
arr2= ["egg"]
print(sol.isIsomorphic(arr1,arr2))