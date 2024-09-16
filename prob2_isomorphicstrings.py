class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(set(s)) != len(set(t)):
            return False

        d = {}
        '''
        zip together every element in s and t, and find out if character at s is available in d which is a dictionary
        if present, check if it is the same as that of t at same index (As it is zipped) 
        if not equal return false immediately, break the loop, else add the key of character to dictionary, and its corresponding value from string t 
        '''
        for i, j in zip(s, t):
            if i in d:
                if d[i] == j:
                    continue
                else:
                    return False
            else:
                d[i] = j
        return True

isomorphic_strings = Solution()
print(isomorphic_strings.isIsomorphic("egg","add"))

'''
Time complexity - O(N) N number of elements in s/t
Space Complexity - O(N) N number of elements in s/t 
'''

