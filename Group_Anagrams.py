# Time Complexity:- O(ns) n=no. of str in strs,s= maximum length of the string
# Space Complexity:- O(ns)
# Approach:- Take a count-list for all the 26 charachters(only lowercase letters allowed), count their occurence
# and make that list(tuple, list can't be hashed) as the key and store the string. This key will always be same for
# any anagram
import collections

class Solution:
    def groupAnagrams(self, strs):
        d=collections.defaultdict(list)
        for i in strs:
            l=[0]*26
            for j in i:
                l[ord(j)-ord('a')]+=1
            d[tuple(l)].append(i)
        return d.values()
                
                
                