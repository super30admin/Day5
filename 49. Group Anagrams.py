# We will use a hashmap to store key as array of 26 ints and values as strings
# We will go over each word, get the count of each individual character and update the counter in the 26 size array
# as we iterate through our string array, if that particular strings characters count appears in our key, we add the string to that key

# Time complexity (O mn) - M is the size of strs, n is average size of each string inside an index of strs


from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        res = defaultdict(list)

        for s in strs:

            count = [0] * 26

            for c in s:
                count[ord(c) - ord("a")] += 1

            res[tuple(count)].append(s)
        
        return res.values()


        
