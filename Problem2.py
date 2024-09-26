class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        result = {}
        result2 = {}
        
        for i in range(len(s)):
            if s[i] in result:
                if result[s[i]] != t[i]:
                    return False
            elif t[i] in result2:
                if result2[t[i]] != s[i]:
                    return False
            else:
                result[s[i]] = t[i]
                result2[t[i]] = s[i]
        
        print(result, result2)
        return True

#Time Complexity will be O(n) where n is the size of the string
#Space Comlexity will be O(1) as there are only going to be at most 26 characters in the hashmap