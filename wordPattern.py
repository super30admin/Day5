# Time Complexity : O(N)
# Space Complexity : O(N) N = length of s
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        """
        Initial Approach - 
            - Try and get the frequencies of each character in pattern and each word in s.
            - at the end.. check if the length of the HM is the same... 
        WRONGGG!!!
        next try:
            - store one letter to one word. One word to one letter. If it don't match then return False
            works^
        """
        patternDict = defaultdict(list)
        sDict = defaultdict(list)
        
        words = s.split()
        
        if len(words) != len(pattern):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] not in patternDict:
                patternDict[pattern[i]] = words[i]
            else:
                if patternDict[pattern[i]] != words[i]:
                    return False
        
        for i in range(len(words)):
            if words[i] not in sDict:
                sDict[words[i]] = pattern[i]
            else:
                if sDict[words[i]] != pattern[i]:
                    return False

        return True