#Time complexity: O(NK) because n strings of k size and iterating over them once
#Space complexity: O(NK) because of hashmap
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        # creating a map with key as str and value as list of strs
        str_map = {}
        # Iterate over all strings
        for s in strs:
            char_arr = [0]*26
            for ch in s:
                #for each string create array of size 26, and update idx according to pos of char
                char_arr[ord(ch)-ord('a')] += 1
            key = str(char_arr)
            if key in str_map:
                str_map[key].append(s)
            else:
                li = [s]
                str_map[key] = li
        
        return str_map.values()
                