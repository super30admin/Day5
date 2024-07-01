
# // Time Complexity : O(n)
# // Space Complexity : O(n) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : I faced the issue to reduce the complexity of search. 

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        abc = s.split(" ")
        dicti = {}
        if len(abc) != len(pattern):
            return False
        values = set()
        for i in range(len(pattern)):
            if pattern[i] not in dicti:
                if abc[i] not in values:
                    dicti[pattern[i]] = abc[i]
                    values.add(abc[i])
                else:
                   return False
            else:
                if dicti[pattern[i]] != abc[i]:
                    return False
        return True
    

    # Approach :
    # Similar to that of isomorphic strings