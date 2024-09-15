""" Time Complexity : O(n)
 Space Complexity : O(1)
 Did this code successfully run on Leetcode :Yes
 Any problem you faced while coding this : No 
"""


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        anagram_map = {}
        prime_nos = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        
        for string in strs:
            result = 1
            for char in string:
                result = result * prime_nos[ord(char) - ord('a')]
            if result not in anagram_map:
                anagram_map[result] = [string]
            else:
                anagram_map[result].append(string)
                
        return anagram_map.values()
        