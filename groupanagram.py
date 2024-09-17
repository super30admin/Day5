class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if(len(strs) == 0):
            s = dict()
            return s
        hm = dict()
        l =[]
        for i in range(len(strs)):
            s = strs[i]
            c = sorted(s)
            t = "".join(c)
            
            res = []
            if (hm.get(t) is None):
                hm[t] = []
                
            hm[t].append(s)
        
        for i in hm.values():
            l.append(i)
          
        return l
                
            
        