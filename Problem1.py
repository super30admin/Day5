#Time Complexity: O(n* aloga) where n is the length of input array and a is the length of longest string in the input array
#Space Complexity: O(n) where n is the length of input array
# Does it runs on leetcode? : Yes
# Approach: use sorted string as hash to group all the anagrams together 
class Solution:
	#Function to group anagrams together from an input array
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mapp = {}
        for st in strs:
            s = ''.join(sorted(st))
            if s in mapp:
                mapp[s].append(st)
            else:
                mapp[s] = [st]
        return [v for v in mapp.values()]