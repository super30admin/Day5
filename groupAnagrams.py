"""
Group anagrams
Approach -
1. Create a primesDict hashmap to map characters to prime integers
2. Calculate prime products by passing the value of each character in a word and multiplying them to form a product
3. Use this calculated product as key to map all the words which will have same prime product i groupAnagram dict
4. Return all the values from groupAnagram dict

TC - O(nk) - n is number of words in string and K is the maximum length of a string in str
SC - O(nk) - space used by groupAnagram dict

"""

strs1 = ["eat", "tea", "tan", "ate", "nat", "bat"]


def primeProducts(primesDict, s):
    primeProd = 1

    for i in range(len(s)):
        primeProd *= primesDict[s[i]]

    return primeProd


def groupAnagrams(strs):
    if strs is None or len(strs) == 0: return strs

    primesDict = {'a': 2, 'b': 3, 'c': 5, 'd': 7, 'e': 11, 'f': 13, 'g': 17, 'h': 19, 'i': 23, 'j': 29, 'k': 31,
                  'l': 37, 'm': 41, 'n': 43, 'o': 47, 'p': 53, 'q': 59, 'r': 61, 's': 67, 't': 71, 'u': 73, 'v': 79,
                  'w': 83, 'x': 89, 'y': 97, 'z': 101}

    groupAnagram = {}
    rtnData = []

    for word in range(len(strs)):
        primeProduct = primeProducts(primesDict, strs[word])
        if primeProduct not in groupAnagram:
            groupAnagram[primeProduct] = [strs[word]]
        else: groupAnagram[primeProduct].append(strs[word])

    for values in groupAnagram:
        rtnData.append(groupAnagram[values])
    return rtnData


if __name__ == '__main__':
    print(groupAnagrams(strs1))
