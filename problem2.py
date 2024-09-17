'''
Time Complexity : O(n) Iterate through the string

Space Complexity : O(1) Since single character as key in hashing

Did this code successfully run on Leetcode : Yes

Explanation:
Solution 1 (isIsomorphic):
Create Hashmap (dictionary in  python)

We use the character of the first string as key for the hashmap (dictionary in python).

if the hash of first string (which is the key) does not exist in the dictionary then check if the value does
not match the existing value -> if this is true then return False else If the character in the second string already
exists as a value in the dictionary then return False else assign the character of the second string as the dictionary
value of the first character.

If loop exits without returning false return True.

Solution 2 (efficientIsIsomorphic):
Use 2 Hashmaps one to check if first string maps correctly to second string and second string maps correct to first string
Much simpler than 1
'''


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mydict = {}
        for i, j in zip(s, t):
            if i in mydict.keys():
                if mydict[i] != j:
                    return False
            else:
                if j in mydict.values():
                    return False
                else:
                    mydict[i] = j

        return True

    def efficientIsIsomorphic(self, s: str, t: str) -> bool:
        mydict = {}
        oppDict = {}

        if len(s) != len(t):
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