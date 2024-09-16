# Time Complexity: O(N)
# Space Complexity: O(N)
# Leetcode all test cases passed: Yes
# Any difficulties: No

class Solution:
    def wordPattern(self, pattern, str):
        dic = {}
        word = str.split(" ")
        if len(word)!=len(pattern):                 # If length of list and pattern are not equal they are not following the constraint
            return False
        for i in range(len(word)):
            if pattern[i] not in dic:               # Check if pattern is already mapped
                if word[i] not in dic.values():     # Check if word of list is in map values
                    dic[pattern[i]] = word[i]
                else:
                    return False                    # If word of list is in map valules it doesn't follow the constraint
            elif dic[pattern[i]]!= word[i]:
                return False
        return True
