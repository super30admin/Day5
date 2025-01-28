# Time Complexity : O(nk) - n is length of strs and k is the avg length of each string of strs
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

"""
I will assign a prime number to each character
Then create a dictionary with
 key : prime product of each character of the string,
 value : strs which have the same prime product of characters

As prime product of characters will be same for anagrams, they all will land in the same key.
"""


def prime_product(s):
    prime_lst = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101]
    product = 1
    for i in range(0, len(s)):
        product = product * prime_lst[ord(s[i]) - ord('a')]
    return product


def groupAnagrams(strs):
    dict_anagrams = {}
    for i in range(0, len(strs)):
        product = prime_product(strs[i])
        if product not in dict_anagrams:
            dict_anagrams[product] = []

        dict_anagrams[product].append(strs[i])

    return list(dict_anagrams.values())



