#
# Time Complexity = O(n) where n is the total number of characters
# Space Complexity = O(n) where n is the total number of characters
# Works on Leetcode https://leetcode.com/problems/group-anagrams/
#
class Solution:
    def groupAnagrams(self, arr: List[str]) -> List[List[str]]:
        from collections import defaultdict
        hashmap=defaultdict(list)
        #convert each string to a encoded list containing frequency of each character
        def encode(s):
            encoding = [0]*26
            for i in s:
                encoding[ord(i)-97]+=1
            return encoding
        for s in arr:
            #using encoded list as key in hashmap to group anagrams together
            hashmap[encode(s)].append(s)
        return hashmap.values()


