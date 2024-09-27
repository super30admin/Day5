#  Leet Code Problem 49
#  Group Anagrams
#  Language Used : Python
#  Link: https://leetcode.com/problems/group-anagrams/
#  Runtime: 100 ms, faster than 32.64% of Python online submissions for Group Anagrams.
#  Memory Usage: 19.2 MB, less than 20.14% of Python online submissions for Group Anagrams.

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        strs2 = strs[:]
        d = dict()
        temp_list = []
        length_of_string = len(strs)
        if strs==[""]:
            return([[""]])
        for item in range(length_of_string):
            strs[item] = ''.join(sorted(strs[item]))
            if strs[item] not in d:
                d[strs[item]] = list()
            d[strs[item]].append(item)
        print(strs2)
        final_list = []
        for item in d:
            temp_list = []
            for x in d[item]:
                temp_list.append(strs2[x])
            final_list.append(temp_list)
        return(final_list)

        
        
            
                
                

        
        