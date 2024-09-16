# Time Complexity : O(n)
# Space Complexity: O(n)
# Leetcode Run: YES
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # convert string into array of sub strings sepreated by " "
        arr=s.split(" ")
        # if both len doesn't match return False
        if len(pattern)!=len(arr):
            return False
        # creating two hash maps
        hash1={}
        hash2={}
        # loop thoruh any of the array
        for i in range(len(pattern)):
            # checking both maps if they are mapped coorectly or not every time 
            # if any value if mapped twice with different value return false a
            if pattern[i] in hash1:
                if hash1[pattern[i]]!=arr[i]:
                    return False
            elif arr[i] in hash2:
                if hash2[arr[i]]!=pattern[i]:
                    return False
            else:
                # if not map please map here
                hash1[pattern[i]]=arr[i]
                hash2[arr[i]]=pattern[i]
        return True