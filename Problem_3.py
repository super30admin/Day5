"""

    Student : Shahreen Shahjahan Psyche

    Time Complexity : O(N)
    Space Complexity: O(N) [Used a dictionary as an auxiliary space]

    This program successfully passed all test cases in Leetcode.


"""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        # storing the 2 strings characters in key-val pairs to keep track the of the pattern
        records = {}
        for i in range(len(s)):
            if s[i] not in records:
                records[s[i]] = t[i]
            else:
                if records[s[i]] == t[i]:
                    pass
                else:
                    return False
        lst = list(records.values())
        
        # checking whether the same value has been assigned to 2 different keys
        for j in lst:
            print(lst.count(j))
            if lst.count(j) >= 2:
                return False
        return True