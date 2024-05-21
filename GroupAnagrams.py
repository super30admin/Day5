from collections import defaultdict

# Time Complexity : O(nk), where n is the number of strings in array and k is the size of the string
# Space Complexity : O(1)
# The groupAnagrams method groups anagrams by using a dictionary (defaultdict) where the key is the prime product and the value is a list of strings with that product. For each string in the input list, it calculates the prime product and adds the string to the corresponding list in the dictionary. The method returns the lists of anagrams by converting the dictionary values to a list.
class Solution:
    def __init__(self):
        self.primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]

    def primeProduct(self, s):
        prod = 1
        for c in s:
            prod *= self.primes[ord(c) - ord('a')]
        return prod

    def groupAnagrams(self, strs):
        if not strs:
            return []
        
        map = defaultdict(list)
        for str in strs:
            prod = self.primeProduct(str)
            map[prod].append(str)
        
        return list(map.values())

# Example 1
solution = Solution()
strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(solution.groupAnagrams(strs))  # Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]

# Example 2
strs = [""]
print(solution.groupAnagrams(strs))  # Output: []

# Example 3
strs = ["a"]
print(solution.groupAnagrams(strs))  # Output: [["a"]]
