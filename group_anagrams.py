# Group Anagram
# Algorithm: Parsing the string one at a time, sorting it (sorted string of two anagram will be same) and adding it to the hmap with key as 
# sorted index and value as the index of the array of string that this string belongs to
# This way for each of the key (sorted string): we can just fetch the indices to get group of anagrams

# Time Complexity: O(n*mlogm)
# Space Complexity: O(nm)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hmap = {}
        for i in range(len(strs)):
            sorted_str = str(sorted(strs[i]))
            if sorted_str in hmap.keys():
                hmap[sorted_str].append(i)
            else:
                hmap[sorted_str] = [i]
        output = []
        for key,value in hmap.items():
            output.append([strs[i] for i in value])
        return output        