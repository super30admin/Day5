#Time Complexity : O(N K log K) where N is number of elements and K is max length of a string
# Space Complexity : O(NK) 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if (strs is None or len(strs) == 0):
                    return [[]]
        hashmap = {}

        for str in strs:
            charStr = list(str)
            charStr.sort()
            sortedStr = "".join(charStr)
            if sortedStr not in hashmap:
                anagrams = []
                hashmap[sortedStr] = anagrams
            hashmap[sortedStr].append(str)
        return hashmap.values()
        
