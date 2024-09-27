class Solution(object):
    def groupAnagrams(self, strs):
        
        h={}
        for i in strs:
            t=tuple(sorted(i))
            if t not in h:
                h[t]=[i]
            else:
                h[t].append(i)
        return h.values()