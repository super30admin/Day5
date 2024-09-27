# Time Complexity : O(NK) considering avg length of strings as K
# Space Complexity : O(NK) for the primes array and the hashmap
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Took me a little while to understand the logic


def primeProduct(s: str):
        res = 1
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 
        23, 29, 31, 37, 43, 47, 53, 59, 67, 71, 73,
        79, 83, 89, 97, 101, 103, 105]

        for i in range(len(s)):
            c = ord(s[i])
            res = res *  primes[c - ord('a')]
        return res
    
def groupAnagrams(arr):
    if len(arr) == 0:
        return []
    mydict = {}
    for s in arr:
        primeprod = primeProduct(s)
        if primeprod not in mydict:
            mydict[primeprod] = []
        mydict[primeprod].append(s)
    
    return list(mydict.values())


strs = ["eat","tea","tan","ate","nat","bat"]
print(groupAnagrams(strs))