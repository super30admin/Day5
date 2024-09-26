# Group anagrams leetcode 49. Group Anagrams
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        # this is used to map char count to list of anagrams
        result = defaultdict(list)
        
        for s in strs:
            # create a list with 26 elements - lower case letters. if upper case too then 52
            count = [0] * 26 
            for  char in s:
                count[ord(char)-ord("a")] += 1
            result[tuple(count)].append(s) 
        print (result)
        return result.values()
                
        
        # Time complexity: O(m*n) where m is the length of strs and n is the avg length of               # strings within the strs
        #space complexity: O(m*n) for the count array and dictionary - size of result 
        
        '''
        This approach was discussed in the class using prime numbers. product of prime numbers         is always a unique number.
        primes = {'a': 2, 
                  'b': 3, 
                  'c': 5, 
                  'd': 7, 
                  'e': 11, 
                  'f': 13,
                  'g': 17,
                  'h': 19,
                  'i': 23,
                  'j': 29,
                  'k': 31,
                  'l': 37,
                  'm': 41,
                  'n': 43,
                  'o': 47,
                  'p': 53,
                  'q': 59,
                  'r': 61,
                  's': 67, 
                  't': 71,
                  'u': 73,
                  'v': 79,
                  'w': 83,
                  'x': 89,
                  'y': 97,
                  'z': 101
                 }
        
        
        subLists = {}
        
        for string in strs:
            product = 1
            
            for character in string:
                product = primes[character] * product
            
            if product in subLists.keys():
                listA = subLists[product]
                listA.append(string)
                subLists[product] = listA
            else:
                subLists[product] = [string]
                
        listToReturn = []
        
        for value in subLists.keys():
            listToReturn.append(subLists[value])
            
        return listToReturn
        
        
        
        
        
        '''