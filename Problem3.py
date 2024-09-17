class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        #Time O(n)
        #Space O(n)
        store1=dict()
        store2=dict()
        allS=s.split()
        if len(allS)!=len(pattern):
            return False
        for i in range(len(pattern)):
            
            if pattern[i] not in store1:
                store1[pattern[i]]=allS[i]   
            else:
                if store1[pattern[i]]!=allS[i]:
                    return False
            if allS[i] not in store2:
                store2[allS[i]]=pattern[i]  
            else:
                if store2[allS[i]]!=pattern[i]:
                    return False
        return True
    #https://leetcode.com/submissions/detail/514611466/
