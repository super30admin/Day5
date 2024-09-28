# Time Complexity : O(n) n is the length of the pattern that is present 
# Space Complexity : O(n) here we use an extra space for hashmap as well as set in order to match the pattern if present or not
# Did this code successfully run on Leetcode :  Yes 
# Any problem you faced while coding this : Yes had to just manage the edge test case of matching length of pattern and len of setvalues of the string


# Your code here along with comments explaining your approach : - Here we use a hash table as well as hash set hash table to keep track of matches in 2 strings
# and set is used in order to check if the character is not mapped twice to same two different keys


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        hashMap = {}
        setOfValues = []
        if len(pattern) != len(words):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in hashMap:
                hashMap[pattern[i]] = words[i]
                if words[i] in setOfValues:
                    return False
                setOfValues.append(words[i])
            elif pattern[i] in hashMap and hashMap.get(pattern[i])!= words[i]:
                return False
        return True