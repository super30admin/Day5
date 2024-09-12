# Check if s[i] and t[i] are isomorphic or not
# TC : O(n)
# SC : O(2n)

class Solution:
    def isIsomorphic(self, s: str, t: str) :
        
        # Take 1 hashmap to store key--> s[i] and value --> t[i]
        if len(s) != len(t):
            return False
        hashmap = {}
        hashset = {0}
        
        i = 0
        while(i <= len(s)-1):
            if s[i] in hashmap:
                if hashmap[s[i]] != t[i]:
                    return False
            elif s[i] not in hashmap:
                if t[i] in hashset:
                    return False
                else:
                    hashmap[s[i]] = t[i]
                    hashset.add(t[i])
            i += 1
        return True