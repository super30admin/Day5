
#Time: O(n*m); n-> number of strings, m-> avg length of string
# Space: O(n); number of unique strings.
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        dic = {}
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        for st in strs:
            key = 1
            for c in st:
                key *= primes[ord(c)-ord('a')]
            if key not in dic:
                dic[key] = [st]
            else:
                dic[key].append(st)
        ans = []
        for _, value in dic.items():
            ans.append(value)
        return ans
                
            
