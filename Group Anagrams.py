class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d = dict()
        result = []
        for s in strs:
            val = self.val(s)
            if(val in d):
                d[val].append(s)
            else:
                d[val] = [s]
        for k in d:
            result.append(d[k])
        return result
    
    def val(self,strk):
        l = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,79, 83, 89, 97, 101]
        #l = [2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27]
        result = 1
        for item in strk:
            k = ord(item)-ord('a')
            result=result*l[k]
        return result
            