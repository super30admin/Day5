#time Complexit O(n*k) n is the no of elements in array and s is the length of the string
class Solution(object):
    def groupAnagrams(self, strs):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        d = {}
        if not strs:
            return []
        else:
            for i in strs:
                p = self.calculate(i,primes)
                if p not in d:
                    d[p] = []
                    d[p].append(i)
                else:
                    d[p].append(i)
        return d.values()

    def calculate(self,string,primes):
        mult = 1
        for i in range(0,len(string)):
            mult  = mult * primes[ord(string[i])-ord('a')]
        return mult


        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
