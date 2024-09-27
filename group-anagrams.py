class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        if len(strs) == 1:
            return [[strs[0]]]
        
        map = {}
        
        for i in range(len(strs)):
            st = ''.join(sorted(strs[i]))
            print(st)
            if st not in map:
                map[st]=[]
                map[st].append(strs[i])
            else:
                map[st].append(strs[i])
        res=[]
        for k in map:
            res.append(map[k])
        return res
                
        
        
        