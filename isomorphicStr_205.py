'''
time = O(n) --- Looping through all the characters in the string

space = O(1) -- constant space for 26 characters

Ran in Leetcode -- yes

Did you face any issues -- No

Method - Used one hashmap to store s and its corresponding t. Used second Hashset to check if the value already exists in the hashmap
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tMap = set()
        if len(s) != len(t):
            return False

        for i in range(len(s)):
            if sMap.__contains__(s[i]):
                if sMap[s[i]] != t[i]:
                    return False
            else:
                sMap[s[i]] = t[i]
                if(tMap.__contains__(t[i])):
                    return False
                else:
                    tMap.add(t[i])
        return True

sol = Solution()
s = "badc"
t = "baba"
print(sol.isIsomorphic(s,t))
