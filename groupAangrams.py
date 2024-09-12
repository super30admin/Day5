# A very simple way to solve this is using dictionaries as discussed in class. Now, in python there is concept of default dictionary in which I have initialized the value to be in form of list
# But the tricky part here is to understand how to stre the kesy, in anagrams no matter what the order is, all letters are same in all words. so I sorted them and then stored them in dictionary.
# There was another method discussed using prime product that can also be used to solve this question.
# Time complexity: O(nlogn)
# space complexity: O(n)
import collections
def groupAnagrams(arr):
    wordDict = collections.defaultdict(list)
    for word in arr:
        key = tuple(sorted(word))
        print(key)
        wordDict[key].append(word)
    print(wordDict)

arr = ["eat", "tea", "tan", "ate", "nat", "hat"]
groupAnagrams(arr)