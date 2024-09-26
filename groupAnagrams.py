#T(n) = O(n*k)
#S(n) = O(1)

class Solution:
    def getInd(self,i):
        primes=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,103]
        result=1
        for j in i:
            result*=primes[(ord(j)-ord('a'))]
        return result
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        di={}
        for i in strs:
            res=self.getInd(i)
            if di.get(res,-1)==-1:
                di[res]=[]
            di[res].append(i)
        return di.values()