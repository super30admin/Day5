# Time complexity :- O(NKlogK)

# Space Complexity :- O(NK)

# Ran on leetcode :- yes. 

# Any problems:- No. Need to figure out a optimized solution than this


from collections import defaultdict

class Solution:

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        final = defaultdict(list)
        
        for word in strs:
            sorted_word = sorted(word)
            merge_sorted = "".join(sorted_word)
            final[merge_sorted].append(word)
            
        return final.values()
    