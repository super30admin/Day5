// Used Prime product
// Add aal th values corresponding to it 
// T.C = O(n)

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """

        hashMap = {}

        for i in range (len(strs)):
            hashValue = self.getHashValue(strs[i])

            if hashValue in hashMap:
                hashMap[hashValue].append(strs[i])
            else:
                hashMap[hashValue] = [strs[i]]
        return hashMap.values()

    def getHashValue(self,str):
        prime_numbers = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        hashVal =  1

        for s in str:
            hashVal = hashVal * prime_numbers[ord(s) - ord('a')]
        return hashVal