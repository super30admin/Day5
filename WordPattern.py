#Time complexity is O(n)
#space complexity is O(1)
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        dict={}
        dict1={}
        sl=s.split()
        if len(sl)!= len(pattern): return False
        for i in range(0,len(pattern)):
            if pattern[i] not in dict:
                dict[pattern[i]]=sl[i]
            elif dict[pattern[i]]!= sl[i]:
                return False
            if sl[i] not in dict1:
                dict1[sl[i]]=pattern[i]
            elif dict1[sl[i]]!=pattern[i]:
                return False
        return True