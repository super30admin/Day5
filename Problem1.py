# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: all test cases passed
# Any problem you faced while coding this: No

# Approach: Take the prime products of the strings and group strings with the same product together. Return the values of the dictionary
# constructed. The prime product would always be unique.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        # consists of lower case english characters only 
        # ascii of a is 97
        
        prime_nums = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        mydict = {}
        
        for string in strs:
            
            mychar = list(string)
            prod = 1
            for char in mychar:
                prod = prime_nums[ord(char)-ord('a')] * prod
                
            if prod in mydict:
                mydict[prod].append(string)
            else:
                mydict[prod] = [string]
        
        return mydict.values()