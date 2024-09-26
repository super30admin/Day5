#Time complexity : O(N)
#Space complexity :O(1)

#Approach : Creating two hashmaps and checking each key with  it's corresponding value in both the hashmaps. 
# yes it passed all the test cases in leet code

class Solution(object):
    def isIsomorphic(self, s, t):
        hash_s,hash_t={},{} # two hashmaps
        if len(s)!=len(t): # checking two lengths are equal or not
            return False
        for i in range(len(s)):
            a=s[i]
            b=t[i]
            if a not in hash_s.keys():
                hash_s[a]=b
            else:
                if hash_s.get(a)!=b: # if corresponding key is equal to particular value
                    return False
            if b not in hash_t.keys():
                hash_t[b]=a
            else:
                if hash_t.get(b)!=a:
                    return False
        return True
    
    
    
#2nd solution 

class Solution(object):
    def isIsomorphic(self, s, t):
        hash_s,hash_t={},{}
        if len(s)!=len(t):
            return False
        for i in range(len(s)):
            if s[i] not in hash_s.keys():
                hash_s[s[i]]=t[i]
            if t[i] not in hash_t.keys():
                hash_t[t[i]]=s[i]
            if (hash_s[s[i]]!=t[i] or hash_t[t[i]]!=s[i]):
                return False
        return True
    
    