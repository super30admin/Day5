# Time Complexity : O(n*n * klogk) [n = number stings in the input list, k = average length of strings in the input list] 
# Space Complexity : O(n) [n = number stings in the input list]
# 
# Did this code successfully run on Leetcode : Partially(TLE)
# 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach 
class Solution:
    def isAnagram(self, s1, s2):
        """
        This functions sort the input strings and compare if they are same
        """
        s1 = "".join([c  for c in sorted(s1)])
        s2 = "".join([c  for c in sorted(s2)])
        return s1 == s2
    
    def groupAnagrams(self, strs):
        l = strs
        res = []
        flag = [False for i in range(l)] # This flag keeps track of whether the string at index i has been traversed or not
        for i in range(len(l)):
            if False == flag[i]: # A new group of anagram is created
                curr = [l[i]]
                for j in range(i+1, len(l)): # Traverse all the strings after i-th index and check whether they fall into the anagram group of string at index i
                    if False == flag[j] and  self.isAnagram(l[i], l[j]): 
                        curr.append(l[j])
                        flag[j] = True # Mark the index in the flag list as True if it the string at that index has been added into one of the anagram group
                res.append(curr)
        return res