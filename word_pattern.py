# // Time Complexity : O(n) 
# // Space Complexity : O(n)  
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pattern = list(pattern)
        s = s.split(' ')
        if len(pattern) != len(s): return False
        
        hashmap = defaultdict(str)
        hashset = set()
        
        for ch,word in zip(pattern,s):
            # if mapping bw pattern and word 
            # exists in hashmap then we check 
            # if the value matches the current word
            # if its doesn't we return false
            if ch in hashmap:
                if hashmap[ch] != word: return False
            else:
                # if the word already exists in the hashset
                # but not in the hashmap, return false
                if word in hashset: return False
                hashmap[ch] = word
                hashset.add(word)
        return True
            