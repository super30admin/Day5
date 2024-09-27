"""
Problem 1:
Given an array of strings, group anagrams together.
Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
Note: All inputs will be in lowercase. The order of your output does not matter.

Approach 1 --
One of the approach is to sort a string and store it in hashmap as a key
Add corresponding values with same alphabets
Return the values in the hashmap.
TC - O(nk logk)
SC - O(nk)

Approach 2 - Better approach -
1. assign each if 26  chars a prime number
2. find product of each character for each word. compare products. saame products are anagram

Use hashmap to store - key = product and value will be the list of strings
TC: O(nk)
SC: O(nk)
"""

strs = ["eat", "tea", "tan", "ate", "nat", "bat"]

def groupAnagrams(strs):
    s_map = {}

    for word in strs:
        sorted_word = "".join(sorted(word))

        if sorted_word not in s_map:
            s_map[sorted_word] = [word]
        else:
            s_map[sorted_word].append(word)
    rtnData = []

    for values in s_map.values():
        rtnData.append(values)
    return rtnData

print(groupAnagrams(strs))