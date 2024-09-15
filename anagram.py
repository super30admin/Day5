'''
Time Complexity: O(nk)
Space Complexity: O(nk)
'''
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        prime_mapping = [2,3,5,7,11,13,
                        17,19,23,29,37,
                        41,43,47,49,53,59,
                        61,67,71,79,83,87,89,
                        97,101]
        hashMap = {}
        for i in range(len(strs)):
            key_name = 1
            for j in range(len(strs[i])):
                key_name = key_name*prime_mapping[ord(strs[i][j])-ord('a')]
            if(key_name in hashMap):
                hashMap[key_name].append(strs[i])
            else:
                hashMap[key_name] = [strs[i]]
        return list(hashMap.values())
        