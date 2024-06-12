class Solution(object):
    def groupAnagrams(self, strs):
        strs.sort()
        dic = dict()
        for i in strs:
            s = tuple([''.join(sorted(i))])
            if s not in dic:
                dic[s] = [i]
            else:
                dic[s].append(i)
        return dic.values()