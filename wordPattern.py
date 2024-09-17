# Time Complexity :  O(nk), where n is the len(pattern) and k is the length of each string in str
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes!
# Any problem you faced while coding this : ..

# Your code here along with comments explaining your approach
class Solution(object):
    # making two hashmaps, char as key for map where each char in pattern is key and
    # with prime number product of all ascii values of a string as key for map where
    # each word in str is a key (reduces lookup time to O(1))
    # checking if the two map to each other uniquely, if not return False.
    primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
    def primeProduct(self, string):
        result = 1
        for i in string:
            result *= self.primes[ord(i) - ord('a')]
        return result


    def wordPattern(self, pattern, str):
        splitString = str.split(" ")
        if len(splitString) != len(pattern):
            return False
        strMap = {}
        pMap = {}
        for i in range(len(pattern)):
            pChar = pattern[i]
            sWord = splitString[i]
            sKey = self.primeProduct(sWord)

            if pChar in pMap:
                if pMap[pChar] != sWord:
                    return False
            else:
                pMap[pChar] = sWord

            if sKey in strMap:
                if strMap[sKey] != pChar:
                    return False
            else:
                strMap[sKey] = pChar
        return True


pattern = "abba"
str = "dog cat cat dog"
print(Solution().wordPattern(pattern, str))
