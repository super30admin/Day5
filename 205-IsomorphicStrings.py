from collections import defaultdict, Counter
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        lst = list()
        a = defaultdict(set)
        if len(s) != len(t): 
            return False
        for i in range(len(s)): 
            a[s[i]].add(t[i])
            
        # print(a)
        for i in a: 
            if len(a[i]) > 1 or a[i] in lst: 
                return False
            lst.append(a[i])
        print(lst)
        return True
    
    # Complexities
    # time complexity = O(n)       
    # space complexity = O(1)  