#Method 1: Sorting the word and adding to dictionary
# TC: O(n*(klogk + k))
# SC: O(n)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict = { }
        for word in strs:
            sortedword = "".join(sorted(word))
            if sortedword not in dict:
                dict[sortedword] = [word]
            else:
                dict[sortedword].append(word)
        result = [ ]
        for item in dict.values():
            result.append(item)
        return result

#Method 1: Using Hash_key of prime number
# TC: O(n*k)
# SC: O(n)

class Solution:
    def __init__(self):
        self.prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        
    def get_key(self, s):
        key = 1
        for i in range(len(s)):
            key *= self.prime[ord(s[i]) - ord('a')]
        return key
            
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict = { }
        for word in strs:
            key = self.get_key(word)
            if key not in dict:
                dict[key] = [word]
            else:
                dict[key].append(word)
        result = [ ]
        for item in dict.values():
            result.append(item)
        return result