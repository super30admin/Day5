# Time Complexity :

# O(NK) , where N is number of strings in str array, and k is avg. lenght of each string


# Space Complexity :  

# O(n), where n is number of strings in strs


# Approach:
# Here, we consider mapping a-z characters to a prime number instead of ASCII values 
# and use the mathematical property that product of unique prime numebrs is constant.

# then, we create a hashMap<primeProduct, List[elements having this primeProduct]>

# then traverse over input array, fill and update the hashMap and return the hashMap values,
# since that contains our answer.

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        if len(strs)==0 or not strs:
            return [[""]]

        # list of 26 prime numbers that will corrrespond to character a-z for this problem
        primeList = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        
        # hashMap to store: key is product of prime number associated with each char in str and value is List[strs] matching the product number
        listStrs = { }

        # iterate over each "str" in strs
        for str in strs:
            primeProduct = 1
            for c in str:
                primeProduct = primeProduct * primeList[ord(c) - ord('a')] # Difference between ASCII of chars gives the index to look into the "primeList" array
            if not primeProduct in listStrs.keys():
                listStrs[primeProduct] = []
            listStrs[primeProduct].append(str)


        # return the values of the maps
        return listStrs.values()