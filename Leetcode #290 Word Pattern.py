# Time Complexity: O(n) 
# Space Complexity: O(1)

class Solution:
    def wordPattern(pattern, s):
        sArray = s.split(" ")
        
        if len(pattern) != len(sArray):
            return False
        
        pattern_dictionary = {}
        s_dictionary = {}
        for i in range(len(pattern)):
            if pattern[i] in pattern_dictionary:
                if pattern_dictionary[pattern[i]] != sArray[i]:
                    return False
            else:
                pattern_dictionary[pattern[i]] = sArray[i]

            if sArray[i] in s_dictionary:
                if s_dictionary[sArray[i]] != pattern[i]:
                    return False
            else:
                s_dictionary[sArray[i]] = pattern[i]
        
        return True

        