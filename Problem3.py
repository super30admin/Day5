#Two functions to check if the given string follows the pattern
class Solution(object):
    #Time Complexity: O(n) where n is number of characters and number of words in string
    # and  they are of same length
    #Space Complexity: O(n) where n is number of characters and number of words in string
    # and  they are of same length
    # Does it runs on leetcode? : Yes
    # Approach: The idea is just to check if the lengths of characters in the  pattern and words
    # in the string  as well as the length of 
    # mapping from each character of pattern to each word of string is same
    def wordPattern1(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        s = pattern
        t = str.split()
        #print(zip(s,t))
        return len(set(zip(s,t)))==len(set(s))==len(set(t)) and len(s)==len(t)

    #Time Complexity: O(n) where n is number of characters and number of words in string
    # and  they are of same length
    #Space Complexity: O(n) where n is number of characters and number of words in string
    # and  they are of same length
    # Does it runs on leetcode? : Yes
    # Approach: Here the idea is to use each character and each word in both strings to map to their positions using a dictionary.
    # Finally we check if the sorted positions from both mappings (dictionary) lineup or not. 
    def wordPattern2(self, pattern: str, str: str) -> bool:
        if len(pattern)!=len(pattern):
            return False
        s = pattern
        t = str.split()
        dict1, dict2 = {}, {}
        for i,v in enumerate(s):
            dict1[v] = dict1.get(v,[]) + [i]
        for i,v in enumerate(t):
            dict2[v] = dict2.get(v,[]) + [i]
        return sorted(dict1.values())==sorted(dict2.values())