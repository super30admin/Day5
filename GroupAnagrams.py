class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        
        '''// Time Complexity : O(nk) where n is the length of the string and k is the average length of the words in the list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach'''
        #Create an empty dictionary/ Hashmap
        grouped=dict()
        #List of first 26 prime nos
        prime_nos=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101]
        
        for word in strs:
            #For every word in the list, let the product be 1
            result=1
            for ch in word:
                #Calculating the index of the prime number do which the character will be mapped
                location=ord(ch)-ord('a')
                result *= prime_nos[location]
            if result not in grouped:
                grouped[result]=[word]
            else:
                grouped[result].append(word)
        return grouped.values()
