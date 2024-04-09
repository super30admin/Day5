# Idea:
# iterate through every word in the array 
# sort each array and  use it as key , and map the corresponding unsorted word as value
# if its anagram , the sort word if already present in the hashmap , 
# if we encounter a key that is already present in the hashmap, just append the unsorted value to the key 
# hence you are grouping the all the anagrams on the basis of sorted version of each word 

# TimeComplexity : O(n * k * logk)

# Space Complexity : O(n * k)

# Works on leetcode 


class Anagram :
    hashMap = {}
    def groupAnagram (self, strs) :

        for s in range(len(strs)):
            sortedStr = ''.join (sorted(strs[s]))
            if sortedStr in self.hashMap:
                self.hashMap[sortedStr].append(strs[s])
            else:
                self.hashMap[sortedStr] = [strs[s]] 
        return list(self.hashMap.values())

test = ["eat","tea","tan","ate","nat","bat"]

obj = Anagram()

result = obj.groupAnagram(test)

print(result)
