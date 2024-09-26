# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
# Convert the string to a prime product and then do the double hash technique
# Maintain two hashmaps for two way mappings
# if both the haspmap chek return true then its valid else not




class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        def PrimeCal(self,string):
            numlist = []
            primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
            result = 1
            for p in string:
                if p != ' ':
                    result *= primes[ord(p) - ord('a')]
                else:
                    numlist.append(result)
                    result = 1
            numlist.append(result)
            return numlist
        
        t = PrimeCal(self,s)
        print(t)
        if len(t) != len(pattern):
            return False
        
        sMap = {}
        tMap = {}
        
        for i in range(len(pattern)):
            
            if pattern[i] not in sMap.keys():
                sMap[pattern[i]] = t[i]
                
            if sMap[pattern[i]] != t[i]:
                return False
            
            if t[i] not in tMap.keys():
                tMap[t[i]] = pattern[i]
                
            if tMap[t[i]] != pattern[i]:
                return False
        return True
            