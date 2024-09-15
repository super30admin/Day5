class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
             return False
        hashs = {}
        hasht = {}
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            if sChar in hashs:
                if hashs[sChar] !=tChar:
                    return False
            else:
                hashs[sChar] = tChar
            if tChar in hasht:
                if hasht[tChar] !=sChar:
                    return False
            else:
                hasht[tChar] = sChar
        return True
            
#TC: O(len(string))
#SC: O(n)#2 hash maps for the 2 strings, we cannot use a single hashmap as it is tough to keep track of which elemenet belongs to which string in that case hence it is required for us to use two maps
                