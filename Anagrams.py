
'''
-- Passed test cases on Leetcode
'''
class Solution:
    #O(m * n) -- Time Complexity where m is the number of given input strings and n is the length of strings
    #O(m * n) -- Space Complexity

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        
        for s in strs:
            cnt = [0] * 26
            
            for c in s:
                cnt[ord(c) - ord('a')] += 1
        
            res[tuple(cnt)].append(s)
            
        return res.values()
        
        
        
        
        
