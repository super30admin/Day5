# Time Complexity :O(n) for iteration zip
# Space complexity :O(m+n) for pattern size and string size. Also s = s.split()
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : used zip function alternative for java 

# We will use a hashmap where we will use the 2 false conditions (if i not in hash1 but j not in hash2) and hash1 key is not equal to hash2 value
# Base condition is size mismatch
# add if not present 

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split()
        hash1 = {}
        hash2 = {}
        
        if len(s) != len (pattern): # Base condition
            return False
        # Now that we know that size is same

        for i, j in zip(pattern,s):
            if i not in hash1:      # False condition 1
                if j in hash2:      # False condition 1
                    return False
                hash1[i] = j        # Add if not present ...a = dog
                hash2[j] = i        # Add if not present ...dog = a
            elif hash1[i] != j:     # False conditoin 2...value a:dog != dog  
                return False
        return True



print(Solution().wordPattern("abba", "cat dog dog cat"))