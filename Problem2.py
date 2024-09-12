"""
Time Complexity - O(N*M) where  N is length of s
                                M is length dictionary keys as it checks if element is in dictionary or not hence traverses all keys
Space Complexity - O(2*N) + O(M) where N is no of keys in dictinary
                                        M is size of set
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        i = 0
        dictionary = {}
        store = set()
        while( i < len(s)):
            if s[i] in dictionary:
                if dictionary[s[i]] != t[i]:
                    return False
            else:
                if t[i] in store:
                    return False
                else:
                    dictionary[s[i]] = t[i]
                    store.add(t[i])
            i += 1    
        return True  