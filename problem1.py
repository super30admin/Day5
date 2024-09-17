'''

Solution 1:
Time Complexity : O(n*k logk) //python sorted method has nlogn complexity
where n is number of elements and k is size of each string

Space Complexity : O(n) // string hashing is O(n)

Did this code successfully run on Leetcode : Yes

Explanation: Sort each string and check if it exits in hashmap (Used dict in python)
Create list for each tuple and if it exists add the string to the list inside the index of each key.

Solution 2:
Time Complexity : O(n) //Prime product + iterate through list
Space Complexity: O(1) // Either characters or numbers in hashmap

Explanation:
Assign every Alphabet in English to a particular prime number. Changed hashing function to find the product of prime numbers
as they are always going to be unique, use this to Convert each character to it and check if tuple exits in hashmap
(Used dict in python) Create list for each tuple and if it exists add the string to the list inside the index of each key.

'''


def setConvert1(self, strs: str) -> int:
    return "".join(sorted(strs))


def setConvert(self, strs: str) -> int:
    prime = {'a': 2, 'b': 3, 'c': 5, 'd': 7, 'e': 11, 'f': 17, 'g': 19, 'h': 23, 'i': 29, 'j': 31, 'k': 37, 'l': 41,
             'm': 43, 'n': 47, 'o': 53, 'p': 59, 'q': 61, 'r': 67, 's': 71, 't': 73, 'u': 79, 'v': 83, 'w': 89, 'x': 97,
             'y': 101, 'z': 103}
    product = 1
    for i in range(0, len(strs)):
        product = product * prime[strs[i]]
    return product


def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    myDict = {}
    if strs == None:
        return None
    for i in strs:
        l = []
        asciiValue = (self.setConvert(i))

        if asciiValue in myDict.keys():
            myDict[asciiValue].append(i)
        else:
            myDict[asciiValue] = [i]

    return (myDict.values())