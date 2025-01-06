class Solution(object):
    def groupAnagrams(self, strs):
       '''
       Function to Group Anagrams
       :param li: list of words
       :return: list of grouped anagrams
       '''
       dictionary = {}

       for s in strs:
            sorted_str = ''.join(sorted(s))  
        
            if sorted_str not in dictionary:
                dictionary[sorted_str] = []
            
            dictionary[sorted_str].append(s)
            
            return list(dictionary.values())


**Time Complexity:** O(n * k log k), where n is the number of strings and k is the maximum length of a string in the input array. This is because for each string, we need to sort its characters.

**Space Complexity:** O(n * k), where n is the number of strings and k is the maximum length of each string. This space is used to store all the strings in the dictionary.
