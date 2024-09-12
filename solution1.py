#https://leetcode.com/problems/group-anagrams/

# // Time Complexity : O(k*n) n = number of items in strs list, k=number of characters in each words
# // Space Complexity :O(1), the inner dictionary is being reused for each word
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this :
# #NOTE TO SELF : using dictionary key:value as key to another dictionary is done using frozenset(dict1.items())
#
#
# // Your code here along with comments explaining your approach
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #strs =["boo","bob"]
        outer = dict()
        inner = dict()
        for words in strs:
            for char in words:
                if char in inner:
                    inner[char]+=1
                else:
                    inner[char]=1
            if frozenset(inner.items()) not in outer:
                outer[frozenset(inner.items())]=[]
            outer[frozenset(inner.items())].append(words)
            inner.clear()

        print(outer)
        return outer.values()
