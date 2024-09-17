# Time Complexity : O(n*k) where n is total no of words, k is avg length of words
# Space Complexity : O(n*k)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# TC - O(nklogk) (Bcoz using hashmap and sorting)
# SC - O(nk)

def groupAnagrams(str):
    dict = {}
    for s in str:
        sorted_str = ' '.join(sorted(s))
        if sorted_str not in dict:
            dict[sorted_str] = []
        dict[sorted_str].append(s)
    res = list(dict.values())
    return res

# more optimized code: using prime product
# TC - O(nk) (Bcoz using  hashmap and not using sorting)
# SC - O(nk)
from collections import defaultdict

def groupAnagram(str):
    res = defaultdict(list)

    for s in str:
        count = [0] * 26 # a....z
        for c in s:
            count[ord(c) - ord('a')] += 1
        res[tuple(count)].append(s)
    return res.values()

# more optimized code: using prime product
# TC - O(nk) (Bcoz using  hashmap and not using sorting)
# SC - O(nk)
# def groupAnagram(str):
#     dict1 = {}
#     for s in str:
#         p = primeProduct(s)
#         if p not in dict1:
#             dict1[p] = []
#         dict1[p].append(s)
#     res = list(dict1.values())
#     return res
# def primeProduct(s):
#     result = 1
#     primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]
#     for i in range(0,len(s)):
#         print(type(i))
#         print(type(s))

#         c = s.find(i)
#         print(type(c))

#         prime = primes[c - ord('a')]

#         result = result * prime
#     return result


# def groupAnagram(strs):

    # letters = ['a','b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

    #     primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 47, 53, 59, 67, 71, 83, 89, 101, 107, 109, 113, 127, 131]
       
    #     dic = dict(zip(letters,primes))
        

    #     anagram_dic = {} # prime_multiplication:list_of_words
    #     for word in strs: 
    #         prime_mul = 1
    #         for letter in word:
    #             prime_mul*=dic[letter]
                
    #         if prime_mul in anagram_dic:
    #             anagram_dic[prime_mul].append(word)
    #         else:
    #             anagram_dic[prime_mul] = [word]

    #     return [anagram_dic[prime_mul] for prime_mul in anagram_dic]



str = ["eat","tea","tan","ate","nat","bat"]
print(groupAnagrams(str))
print(groupAnagram(str))