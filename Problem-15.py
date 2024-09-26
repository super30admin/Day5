# it passed all the test cases in leetcode -290
#Time complexity : O(N)
#Space complexity :O(1)

#Approach : Creating two hashmaps and checking each key with  it's corresponding value in both the hashmaps. Same approach as Isomorphic problem

class Solution(object):
    def wordPattern(self, pattern, str):
        p=list(pattern)
        s=str.split()
        
        hash_1,hash_2={},{}
        
        if len(p)!=len(s):
            return False
        for i in range(len(p)):
            if (p[i] in hash_1 and  hash_1.get(p[i])!=s[i]):
                return False
            if (s[i] in hash_2 and hash_2.get(s[i])!=p[i]):
                return False
            if p[i] not in hash_1:
                hash_1[p[i]]=s[i]
            if s[i] not in hash_2:
                hash_2[s[i]]=p[i]
        return True
            
        
