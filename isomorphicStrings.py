# Leetcode 205. Isomorphic Strings

# Time Complexity :  O(n) where n is the size of the word

# Space Complexity : O(1) as the size of hashmaps is independent of the input size

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Condition: To check one to one mapping we can add letter from first word to a hashmap as key.
# letter from second word will be added as value to the hashmap. A second hashmap with key value pair reversed 
# is created. If the letter is not present we add it and its mapping to hashmaps, if it is present we check 
# its mapping in the first hashmap and the reverse the order in second hashmap to letter from second word is 
# mapped to the same letter from the first  word. if not return false else true.

# Your code here along with comments explaining your approach

def isIsomorphic(self, s: str, t: str) -> bool:
        hashmap1 = dict()
        hashmap2 = dict()
        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            if s[i] not in hashmap1:
                hashmap1[s[i]] = t[i]
            elif hashmap1[s[i]] != t[i]:
                return False
            
        for i in range(len(t)):
            if t[i] not in hashmap2:
                hashmap2[t[i]] = s[i]
            elif hashmap2[t[i]] != s[i]:
                return False
        return True