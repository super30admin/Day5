# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Your code here along with comments explaining your approach:
# - using two hash maps t solve this problem, smap contains the mapping of characters in s to characters in t
# - tmap contains the mapping of characters in t to characters in s
# - we iterate the string s, if there is no key in smap with that character, we add one
# - if there is one mapping already, we check if it is mapped to the expected character from try
# - if not, strings are not isomorphic
# - similarly, we check for tmap as well
    

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        # using two hashmaps
        smap = {}
        tmap = {}

        # base case
        if (len(s) != len(t) or s is None):
            return False

        for i in range(len(s)):
            # if every character in s is a key in the hashmap
            if s[i] in smap:
                # if the s key already exists in the smap
                # then we check if it is mapped correctly
                if smap[s[i]] != t[i]:
                    return False
            
            # key is not present the hashmap     
            else:
                smap[s[i]] = t[i]
            
            # checking if the t char value is there in tmap
            if t[i] in tmap:
                # if the key exists
                # then we check if the value is what we expect
                if tmap[t[i]] != s[i]:
                    return False
            else:
                # key does not exist, so we add it
                tmap[t[i]] = s[i]
        
        # surpassed all the false conditions, so the strings are isomorphic
        return True

            



