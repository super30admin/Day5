def isIsomorphic(s, t):
        hashMap_s= {}
        hashMap_t= {}
        for s1, t2 in zip(s, t):
            if (s1 not in hashMap_s) and (t2 not in hashMap_t):
                hashMap_s[s1] = t2
                hashMap_t[t2] = s1
            elif hashMap_s.get(s1) != t2 or hashMap_t.get(t2) != s1:
                return False    
        return True
# Time Complexity---- O(N)
# Space Complexity -----O(1)