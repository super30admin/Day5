# // Time Complexity : O(n) 
# // Space Complexity : O(n)  
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs: return []
        hashmap = defaultdict(list)
        for each in strs:
            # now key becomes a unique identifier 
            # for each anagram of the word
            word = ''.join(sorted(each))
            hashmap[word].append(each)
        res = []
        for k,v in hashmap.items():
            res.append(v)
        return res