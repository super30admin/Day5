
"""

    Student : Shahreen Shahjahan Psyche

    Time Complexity : O(N)
    Space Complexity: O(N) [Used a dictionary as an auxiliary space]

    This program successfully passed all test cases in Leetcode.


"""
class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        
        # edge case
        if pattern is None or str is None:
            return False
        
        # edge case
        if len(pattern) == 0 and len(str) == 0:
            return True
        # edge case
        if len(pattern) == 0 or len(str) == 0:
            return False
        
        
        records = {}
        list_values = str.split(" ")
        
        # if after splitting the second string, the new size of the array is not same as pattern, that means it does not follow the pattern. 
        if len(pattern) != len(list_values):
            return False
        
        for i in range(len(pattern)):
            # saving the pattern with corrosponding string. before that checking whether the key or the value exists or not
            if pattern[i] in records.keys():
                if records[pattern[i]] == list_values[i]:
                    continue
                else:
                    return False
            else:
                if list_values[i] in records.values():
                    return False
                else:
                    records[pattern[i]] = list_values[i]
        
        return True
            
        
