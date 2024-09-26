#// Time Complexity :O(n) #n is the length of string
#// Space Complexity :O(n)
#// Did this code successfully run on Leetcode :yes
#// Any problem you faced while coding this :no

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hashmap={}
        word=s.split(' ')
        if(len(pattern)!=len(word)):
            return False
        for i in range(len(word)):
            if 'p_'+pattern[i] not in hashmap:
                hashmap['p_'+pattern[i]]=i
            if 'w_'+word[i] not in hashmap:
                hashmap['w_'+word[i]]=i
            if(hashmap['p_'+pattern[i]]!= hashmap['w_'+word[i]]):
                    return False
                
       

        return True