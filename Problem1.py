"""
// Time Complexity : o(n), where n  is the number of strings
// Space Complexity : o(n), dictionary size
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

"""

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d=dict() #creating a dictionary
        
        for i in strs: #iterating over each string in strs list
            if ''.join(sorted(i)) not in d: #sorting the string i and checking if its not there in the dictionary already
                d[''.join(sorted(i))]=[i] #adding the string at its correct key
            else:
                d[''.join(sorted(i))].append(i)
        
        res=[] #creating output list
        for i in d:
            res.append(d[i]) #list of lists having all anagrams grouped together
        
        return res