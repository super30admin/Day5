#Time Complexity - O(n)
#Space Complexity - O(nk)
#Successfully complied and run in Leetcode


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}
        for eachstr in strs: # sorting each string in the given list
            sortstr = "".join(sorted(eachstr))

            # Key = Sorted String # Value = List of that particular sorted string's anagram
            if sortstr not in hashmap: #key isnt there in hashmap
                hashmap[sortstr] = [eachstr] # insert the key and create its value list
            else:
                hashmap[sortstr].append(eachstr) #if key already there, just add on current str its value list
        return list(hashmap.values()) #return hashmap values(anagrams) in form of list as expected
