# APPROACH 1: (MY APPROACH BEFORE CLASS)
# Time Complexity : O(sk) or O(pk) where s is the length of str and p is the length of pattern. for valid cases s == p.
# Space Complexity : O(k) as number of entries in set is p (constant as max can only be 26) and k is the length of the longest (average) string in str
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : First, checked only correspondence one way and not both way. 
#
#
# Your code here along with comments explaining your approach
# 1. Check if the length of the pattern and number of words in str is same -> YES : proceed further
#                                                                          -> NO: return False
# 2. Create a dict whose keys are pattern and values are words (this stores pattern -> word) corresspondence and set to keep track of words already seen
# 3. Traverse through patterns and str simultaneously -> if pattern in dict, compare the value with word in str -> If same: proceed further
#                                                                                                               -> If No: return False
#                                                     -> if pattern not in dict, check if the word of str in set -> If NO: create entry in dict and set
#                                                                                                                -> If YES: return False (word is already exist as value for 
#                                                                                                                                           some other key)

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        
        str_list = str.split(" ")
        
        if len(pattern) == 0 and len(str_list) == 0:
            return True
        
        elif pattern is None or str is None or len(pattern) != len(str_list):
            return False
        
        hash_pattern = {}
        set_word = set()
        for ind in range(len(pattern)):
            if pattern[ind] in hash_pattern and hash_pattern[pattern[ind]] != str_list[ind]:
                return False
            
            elif pattern[ind] not in hash_pattern:
                if str_list[ind] not in set_word:
                    hash_pattern[pattern[ind]] = str_list[ind]
                    set_word.add(str_list[ind])
                else:
                    return False
                
        return True






# APPROACH 2: CLASS APPROACH (SIMILAR TO 1)
# Time Complexity : O(sk) or O(pk) where s is the length of str and p is the length of pattern, for valid cases s == p. Addidng words to hashmap is not constant time operation.
# Space Complexity : O(k) as number of entries in either of the hashes is p or s (both need to be same for valid cases) (constant as max can only be 26) and k is the length of 
#                    the longest (average) string in str
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None
#
#
# Your code here along with comments explaining your approach
# 1. Same as above APPROACH 1
# 2. ONLY DIFFERENCE IS: use two hashmaps instead of hashmap and set to stoe corresspondence mapping from both sides.

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        
        str_list = str.split(" ")
        
        if len(pattern) == 0 and len(str_list) == 0:
            return True
        
        elif pattern is None or str_list is None or len(pattern) != len(str_list):
            return False
        
        hash_pattern, hash_str = {}, {}
        for ind in range(len(pattern)):
            
            if pattern[ind] in hash_pattern and hash_pattern[pattern[ind]] != str_list[ind]:
                return False
            
            elif pattern[ind] not in hash_pattern:
                hash_pattern[pattern[ind]] = str_list[ind]
                
            if str_list[ind] in hash_str and hash_str[str_list[ind]] != pattern[ind]:
                return False
            
            elif str_list[ind] not in hash_str:
                hash_str[str_list[ind]] = pattern[ind]
                
        return True
        
