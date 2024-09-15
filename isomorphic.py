#time complexity: O(nk)
#space complexity: O(n)

class Solution:
    def isIsomorphic(self, s, t):
        self.s=s
        self.t=t
        s_hashmap={}
        t_hashmap={}
        
        if len(s)!=len(t):
            return False
        else:
            for i in range(len(s)):
                if s[i] not in s_hashmap.keys():
                    s_hashmap[s[i]]=t[i]
                    
                elif(s_hashmap[s[i]]!=t[i]):
                    return False
                
            for i in range(len(t)):
                if t[i] not in t_hashmap.keys():
                    t_hashmap[t[i]]=s[i]
                elif(t_hashmap[t[i]]!= s[i]):
                    return False
                
            print(s_hashmap, t_hashmap)
            return True