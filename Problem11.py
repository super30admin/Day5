"""
Group Anagrams

Given an array of strings, group anagrams together.

Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]

Note: All inputs will be in lowercase. The order of your output does not matter.

"""
"""
Algorithm

1) Each word is sorted in alplabetical order i.e., eat ==> aet, tea==> aet...
2) These sorted words are appending into dict
3) while traversing through the array, when the element has his sorted word in the dict, it is appending to the dict with sorted element as its key
4) Entire dictionary values is printed

"""

# def Anagrams(Input):
def Anagram(Input)
    dict1= {}
    for word in Input:

        sortedword = "".join(sorted(word))

        if sortedword not in dict1:
            dict1[sortedword] = [word]
        else:

            dict1[sortedword].append(word)
    result =[]

    for items in dict1.values():
        result.append(items)
    return(result)


"""

Time Complexity : O(1)
Space Complexity : O(1)

"""
