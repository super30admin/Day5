# Two functions to check if thre given pair of strings is isomorphic 
class Solution(object):
	#Time Complexity: O(n) where n is length of both the input strings, assuming both strings are of same length
    #Space Complexity: O(n) where n is length of both the input strings, assuming both strings are of same length
    # Does it runs on leetcode? : Yes
    # Approach: The idea is just to check if the lengths of both strings as well as the length of 
    # mapping from each character of s to t is same
    def isIsomorphic1(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        #print(zip(s,t))
        return len(set(zip(s,t)))==len(set(s))==len(set(t))

    #Time Complexity: O(nlogn) where n is length of both the input strings, assuming both strings are of same length
    #Space Complexity: O(n) where n is length of both the input strings, assuming both strings are of same length
    # Does it runs on leetcode? : Yes
    # Approach: Here the idea is to use each character in both strings to map to their positions using a dictionary.
    # Finally we check if the sorted positions from both mappings (dictionary) lineup or not. 
    def isIsomorphic2(self, s: str, t: str) -> bool:
        dict1, dict2 = {}, {}
        for i,v in enumerate(s):
            dict1[v] = dict1.get(v,[]) + [i]
        for i,v in enumerate(t):
            dict2[v] = dict2.get(v,[]) + [i]
        return sorted(dict1.values())==sorted(dict2.values())