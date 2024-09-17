'''
Time Complexity : O(n)  Iterate through the string

Space Complexity : O(n) String is used in Hashmap hence O(n)

Did this code successfully run on Leetcode : Yes

Explanation: Create Hashmap (dictionary in  python)
Split the words using space and generate a list of words instead of using the string directly.

We use the character of the first string as key for the hashmap (dictionary in python).

if the character of first string (which is the key) does not exist in the dictionary then check if the value does
not match the existing value in the dictionary -> if this is true then return False else If the  in the second string already
exists as a value in the dictionary then return False else assign the word of the second string as the dictionary value of
the first character.

If loop exits without returning false return True.

Solution 2 (EfficientwordPattern):
Split the words using space and generate a list of words instead of using the string directly.
Use 2 Hashmaps one to check if first string maps correctly to second string and second string maps correct to first string
Much simpler than 1
'''


class Solution:
    def wordPattern(self, pattern: str, str1: str) -> bool:
        mydict = {}


        str2 = str1.split(' ')
        if len(pattern) != len(str2):
            return False

        for i, j in zip(pattern, str2):
            if i in mydict.keys():
                if mydict[i] != j:
                    return False
            else:
                if j in mydict.values():
                    return False
                else:
                    mydict[i] = j

        return True

    def EfficientwordPattern(self, s: str, t: str) -> bool:
        mydict = {}
        oppDict = {}

        t = t.split(' ')

        if len(pattern) != len(t):
            return False

        for i, j in zip(s, t):
            if i not in mydict.keys():
                mydict[i] = j
            else:
                if j != mydict[i]:
                    return False

            if j not in oppDict.keys():
                oppDict[j] = i
            else:
                if i != oppDict[j]:
                    return False

        return True