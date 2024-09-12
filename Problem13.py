"""
Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true

Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false

Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false

Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false
Notes: You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space

"""
pattern = "abba"
str = "dog cat dog dog"
hashmap={}
mapval = {}
word= str.split(' ')

if len(word) != len(pattern):
    print (False)

for i in range(len (pattern)):

    if pattern[i] in hashmap:
        if hashmap[pattern[i]] != word[i]:
            print(False)
    else:
        if word[i] in mapval:
            print(False)
        hashmap[pattern[i]]= word[i]
        mapval[word[i]] = True
print (True)


"""
Time Complexity : O(n)
Space Complexity: O(c), c= unique count for patters

"""
