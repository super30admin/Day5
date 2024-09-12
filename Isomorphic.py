#Time Complexity : O(N)
#Space Complexity: O(N)
#Code Ran successfully in leet code
#Prcoedure:
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # check if len is not same of both s,t
        if len(s)!=len(t):
            return False
        first = {}  #initialize Dictionary
        # loop is to check whether key and index have same value or not
        # make two loop mainly to check if there is same index whether value is diffeent or not 
        #(checking is done by keeping s as index and t as index)
        # In first loop we check the whether value t is same as the the key s
        for i in range(len(s)):
            if s[i] in first and t[i] != first[s[i]]:       # check the False condition
                return False
            first[s[i]] = t[i]  # enter T value at S index
            
        # Do same by keeping t as index and check S value
        second = {}                                    
        for i in range(len(t)):
            if t[i] in second and s[i] != second[t[i]]:
                return False
            second[t[i]] = s[i]
        return True