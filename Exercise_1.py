   
    # 49. Group Anagrams

    # Time Complexity : O(nklogk)
    # Space Complexity : O(k)
    # Did this code successfully run on Leetcode : Yes
    # Any problem you faced while coding this : No

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        primeIndex = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        hash_map = {}
        arr = []
        
        def primeProduct(word):
            result = 1
            for alpha in word:
                # index = 
                result = result * primeIndex[(ord(alpha) - ord('a'))]
            # print(result)
            return result
        
        for i in range(len(strs)):
            if not hash_map.get(primeProduct(strs[i])):
                hash_map[primeProduct(strs[i])] = [strs[i]]
            else:
                hash_map.get(primeProduct(strs[i])).append(strs[i])
        return hash_map.values()