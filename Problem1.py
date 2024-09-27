# group anagrams
# // Time Complexity : O(nK log K) where n is length of strs and k is max length of str 
# (for sorting the strings)
# // Space Complexity : O(nk) for extra dictionary space used
# // Did this code successfully run on Leetcode : yes
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d={}
        anagram=[]
        for i in strs:
            sorted_i=''.join(sorted(i))
            if sorted_i not in d:
                d[sorted_i]= [i]
            else:
                d[sorted_i].append(i)
        for value in d.values():
            anagram.append(value)
        return anagram