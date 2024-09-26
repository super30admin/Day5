class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:#time O(N) space O(1)
        dic={}
        if strs == None or len(strs)==0:return [[""]]
        for s in strs:
            val=self.calP(s)
            if val not in dic:
                dic[val]=[]
            dic[val].append(s)
        return dic.values()
    def calP(self,st):
        mu=1
        prime=[2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]
        for i in st:
            mu*=prime[ord(i)-ord('a')]
        return mu
