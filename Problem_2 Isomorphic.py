# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
#
#
# // Your code here along with comments explaining your approach

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashmap1 = {}  #Using 2 Hashmaps
        hashmap2 = {}
        n = len(s)
        for i in range(n):
            if s[i] not in hashmap1.keys():
                hashmap1.update({s[i]: t[i]})    #Updating Hashmap1
            else:
                if hashmap1[s[i]] != t[i]:
                    return False
        for j in range(n):
            if t[j] not in hashmap2.keys():
                hashmap2.update({t[j]: s[j]})       #Updating Hashmap2
            else:
                if hashmap2[t[j]] != s[j]:
                    return False

        print(hashmap1)
        print(hashmap2)
        return True