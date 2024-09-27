# // Time Complexity : O(n) 
# // Space Complexity : O(n)  
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none

# // Your code here along with comments explaining your approach
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t): return False
        
        hashmap = defaultdict(str)
        hashset = set()
        
        for ch1,ch2 in zip(s,t):
            if ch1 in hashmap:
                if hashmap[ch1] != ch2: return False
            else:
                if ch2 in hashset: return False
                hashmap[ch1] = ch2
                hashset.add(ch2)
        return True
