#Space Complexity: O(n)  where n is  length of str: For 2 dictionaries
#Time Complexity: O(n)- where n is  length of str
#Approach:
#Used 2 hash maps to store char in first str and corresponding char mapped in 2nd str
#We use the 2nd hash map to do the same for 2nd str to ensure each char is mapped to unique char in bot the str

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dic_s = {}
        dic_t = {}
        for i in range(len(s)):
            if s[i] not in dic_s:
                dic_s[s[i]] = t[i]
            elif dic_s[s[i]] != t[i]:
                return False
            if t[i] not in dic_t:
                dic_t[t[i]] = s[i]
            elif dic_t[t[i]] != s[i]:
                return False
        return True

