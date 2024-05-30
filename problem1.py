'''
# Hashing-1
## Problem 1:
Given an array of strings, group anagrams together.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:
All inputs will be in lowercase.
The order of your output does not matter.

'''

'''
Approach:
Solution 1:
- maintain a hashmap where the keys are all unique sorted strings
  and values are lists containing strings
- for every string in input, get the sorted character string
- check if the sorted string is in the hashmap, 
  if yes append the current input string to the list mapped to that key
- else, add a a new entry with the sorted string as key and a list containing input string as value
- after the input iteration is complete, iterate over the hashmap and get all the mapped lists in a list
- return the list of lists

Time Complexity - O(klogk * n)
Space Complexity - O(n) in the worst case if each string is made of entirely different letters

Solution2:
- This uses the same approach as solution 1 expect we don't sort the string and use a custom hash function instead,
  to reduce the O(klogk) time spent on sorting the string.
- In the hash function, use a pre defined mapping of small case characters to prime numbers.
- multiply all the corresponding values and get an integer product.
- use this integer product value as the key.

Time Complexity - O(k * n)
Space Complexity - O(n) in the worst case if each string is made of entirely different letters

'''

class Solution1:
  def groupAnagrams(self, strs):
    if not strs or len(strs) == 0:
      return []
    groupedAnagrams = {}
    for string in strs:
      sortedString = ''.join(sorted(string))
      if sortedString not in groupedAnagrams:
        groupedAnagrams[sortedString] = [string]
      else:
        groupedAnagrams[sortedString].append(string)
    return list(groupedAnagrams.values())

class Solution2:
  def groupAnagrams(self, strs):
    if not strs or len(strs) == 0:
      return []
    groupedAnagrams = {}
    for string in strs:
      hashValue = self.hashString(string)
      if hashValue not in groupedAnagrams:
        groupedAnagrams[hashValue] = [string]
      else:
        groupedAnagrams[hashValue].append(string)
    return list(groupedAnagrams.values())

  def hashString(self, string):
    primeValues = {'a': 2, 'b': 3, 'c': 5, 'd': 7, 'e': 11, 'f': 13, 'g': 17, 'h': 19, 'i': 23, 'j': 29, 'k': 31, 'l': 37, 'm': 41, 'n': 43, 'o': 47, 'p': 53, 'q': 57, 'r': 59, 's': 61, 't': 67, 'u': 71, 'v': 73, 'w': 79, 'x': 83, 'y': 87, 'z': 89}
    hashValue = 1
    for char in string:
      hashValue *= primeValues[char]
    return hashValue

input = ["eat", "tea", "tan", "ate", "nat", "bat"]

print('Solution 1: Hashing sorted strings')
s1 = Solution1()
output1 = s1.groupAnagrams(input)
for row in output1:
  print(row)

print('Solution 2: Hashing without sorting using custom hash function.')
s2 = Solution2()
output2 = s2.groupAnagrams(input)
for row in output2:
  print(row)
