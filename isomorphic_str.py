# Time Complexity: O(n)
# Space Complexity: O(n + n) = O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map_h1 = {}
        map_h2 = {}
        
        # check if both s and t have same size or not
        if len(s) != len(t):
            # return false as the s and t do not match
            return False
        
        for i in range(len(s)):
            c = s[i]
            w = t[i]
            
            # check if the c key is present 1st hashmap and the value of that key is equal to w or not
            if c in map_h1.keys() and map_h1[c] != w:
                # if true then return false
                return False
            else:
                # add the w value for c key
                map_h1[c] = w
                
            # check if the w key is present 2nd hashmap and the value of that key is equal to c or not
            if w in map_h2.keys() and map_h2[w] != c:
                return False
            else:
                # add the c value for w key
                map_h2[w] = c

        # return true if all the above cases are not true
        return True