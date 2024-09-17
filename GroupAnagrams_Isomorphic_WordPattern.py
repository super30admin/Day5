# ************************** Group Anagrams ***********************************************


# Time Complexity : O(nk logk) n is the number of strings and k is the max characters of strings
# Space Complexity : O(nk)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# As anagrams have same characters with same count I have used dictionary to store the string sorted values of the tuple. 
#Iterating through the strs list and sorting each string in the list which will be used as a key of dictionary. 
# 'eat' can be converted to ('a','e','t') and also 'ate' can be converted ('a','e','t') as well which will be added to same dictionary key.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            return []
        
        d = collections.defaultdict(list)
        for i in strs:
            d[tuple(sorted(i))].append(i)
        return d.values()
        
#Second Approach: Here instead of sorting the string which takes nlogn runtime, I have used a list named count, 
#which I can store the index of the character present in that particular string. I am converting that list to tuple and adding into dictionary as a key. 
#If the same key present in the dictionary for other string, It will be added to that key as a value.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            return []
        
        d = collections.defaultdict(list)
        for s in strs:
            count = [0]*26
            for c in s:
                count[ord(c)-ord('a')] +=1
            d[tuple(count)].append(s)
        return d.values()
        

# **********************************  Isomorphic Strings   **************************************************************

# Time Complexity : O(n) n is the number of characters of strings
# Space Complexity : O(2n) Dictionary and set
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Used dictionary to store the mapped pairs and a set to store the already mapped characters.Initialized the dict and a set. Looping through the elements of both strings and mapping the s key to t value.
# I am checking if the key is already in the dict, then if the value is equal to char in the string t or not.
#Second, Checking if the character t is already mapped or not using set. If it is already mapped returning False.
# Third if the char of s is not present in the dict, add it to the dict. 
        
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d = {}
        mapped= set()
        for i,j in zip(s,t):
            if i in d:
                if d[i]!=j:
                    return False
            elif j in mapped:
                return False
            else:
                d[i] = j
                mapped.add(j)
        return True

# *************************************** WordPattern ************************************************      

# Time Complexity : O(n) n is the number of characters of strings in pattern
# Space Complexity : O(n) Dictionary and set
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Same as the previous problem. Converted the string to list by splitting at the space character. Checked the base conditions
# number of characters in pattern and str are equal. ALso the distinct chars and strs are equal, If not return False
#Used dictionary to store the mapped pairs. Initialized the dict and a set. Looping through the elements of both pattern and strings and mapping the pattern key to strs value.
# I am checking if the key is already in the dict, then if the value is equal to char in the string t or not.
# Second if the char of pattern is not present in the dict, add it to the dict.    
    
class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        s = str.split(' ')

        if len(pattern) != len(s) or len(set(pattern)) != len(set(s)) or not pattern or not s:
            return False
        
        d = {}
        for i,j in zip(pattern,s):
            if i in d:
                if d[i] != j:
                    return False
            else:
                d[i] = j
        return True