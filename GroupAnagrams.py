class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs==None or len(strs)==0:
            return []
        d={}
        for i in range(len(strs)):
            s="".join(sorted(strs[i]))
            if s not in d:
                d[s]=[strs[i]]
            else:
                d[s].append(strs[i])
        result=[]
        for i in d:
            result.append(d[i])
        return result

