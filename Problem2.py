# Time Complexity : O(n) n is the length of s i.e. string  
# Space Complexity : O(1) here we are dealing with only 26 characters and not more than that so it is constatn
# Did this code successfully run on Leetcode :  Yes 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach : - Here we use a hash table as well as hash set hash table to keep track of matches in 2 strings
# and set is used in order to check if the character is not mapped twice to same two different keys


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        isomorphicDict = {}
        setOfValues = []
        for i in range(len(s)):
            if s[i] not in isomorphicDict:
                isomorphicDict[s[i]] = t[i]
                if t[i] not in setOfValues:
                    setOfValues.append(t[i])
                else:
                    return False
            elif s[i] in isomorphicDict and isomorphicDict.get(s[i]) !=t[i]:
                return False
        return True  
                