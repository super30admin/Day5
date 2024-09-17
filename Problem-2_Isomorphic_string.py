# APPROACH - 1: (MY APPROACH) DIDN'T WORK  
# Time Complexity : O(max(s log s, t log t)) - s is the length of s ad t is the length of t, sort function is used
# Space Complexity : O(1) as the length of both the hashmaps is constant (max : 26)
# Did this code successfully run on Leetcode : NO
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. first checked if the length of both strings are equal or not
# 2. Build two dicts one for s and other for t -  to store the count of unique chars
# 3. Then check whether the length of both dicts are same
# 4. Then check if the sorted values of both dicts are same
# 5. PROBLEM: Doesn't preserve the order of letters - eg:- aba, baa which my algo will pass but they are not isomorphic.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) == 0 and len(t) == 0:
            return True
        
        elif (not s or not t) or (len(s) != len(t)):
            return False
        
        hash_s = defaultdict(int)
        for char in s:
            hash_s[char] += 1
            
        hash_t = defaultdict(int)
        for char in t:
            hash_t[char] += 1
            
        # Check whether number of unique chars is same or not
        if len(hash_s) != len(hash_t):
            return False
        
        else:
            if list(hash_s.values()).sort() == list(hash_t.values()).sort():
                return True
            
            else:
                return False
                
  
  
  
  
# APPROACH - 2: CORRECT APPROACH  
# Time Complexity : O(s) or O(t) - s is the length of s ad t is the length of t and to be a valid case to check, s == t.
# Space Complexity : O(1) as the length of both the hashmaps is constant (max : 26)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. first checked if the length of both strings are equal or not
# 2. Build two dicts one for s and other for t - to store correspondence (1-1 mappping)
# 3. Go through two lists and check if char is in hashmap or not -> YES: check if the mapping is same as the current letter of other string -> YES: proceed further
#                                                                                                                                           -> NO: return False
#                                                                -> NO: create an entry and store the mapping. 
# 4. Do for both the hashmap as we need 1-1 correspondence from both string's side. 
                                
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) == 0 and len(t) == 0:
            return True
        
        elif (not s or not t) or (len(s) != len(t)):
            return False
        
        hash_s, hash_t = {}, {}
        for ind in range(len(s)):
            
            if s[ind] in hash_s and hash_s[s[ind]] != t[ind]:
                return False
            
            elif s[ind] not in hash_s:
                hash_s[s[ind]] = t[ind]
                
            
            if t[ind] in hash_t and hash_t[t[ind]] != s[ind]:
                return False
            
            elif t[ind] not in hash_t:
                hash_t[t[ind]] = s[ind]
                
        return True
                
        
