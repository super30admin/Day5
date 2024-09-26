#// Time Complexity :O(n) #n is the length of string
#// Space Complexity :O(n)
#// Did this code successfully run on Leetcode :yes
#// Any problem you faced while coding this :no

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashmap={}
        if(len(s)!=len(t)):
            return False
        for i in range(len(s)):
            if 's_'+s[i] not in hashmap:
                hashmap['s_'+s[i]]=i
            if 't_'+t[i] not in hashmap:
                hashmap['t_'+t[i]]=i
            if(hashmap['s_'+s[i]]!= hashmap['t_'+t[i]]):
                    return False
                
        return True