'''
Time Complexity: O(n) an extra intial over head of for loop O(2n) = O(n) when calculating the list of 26 prime numbers
Space Complexity: O(n) to store the list of prime numbers but only an intial cost and O(n) of hahsmap storing the key and list of anagrams
Leetcode: Successful
Problem: Calculating the prime numbers, mapping to hash

Note: please provide feedback on how i can improve the code.
'''

class Solution:
    def groupAnagrams(self, strs):
        # Sanity check: whehter the list is null or empty
        if strs == None or len(strs)==0:
            return False
        # initialize dictionary for hashmap
        hashMap = {}

        # iterate through the list of string and pass each string
        for s in strs:
            # Calculate a unique key for value via prime numbers
            key = self.primekey(s)

            # if key is not in hashmap thenadd the key and a list of the corresponding value
            if not hashMap.__contains__(key):
                hashMap[key] = [s]

            # otherwise append to the list of strings at corresponding key
            else:
                hashMap[key].append(s)
        # return a list of all the values in the dictionary.
        return list(hashMap.values())

    def primekey(self,s):
        # pr = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]

        # Calculate 26 prime numbers
        pr = []
        for num in range(2, 105):
            prime = True
            for i in range(2, num):
                if (num % i == 0):
                    prime = False
            if prime:
                pr.append(num)
        # calculate unique key
        ans = 1
        # iterate through each letter in the string
        for i in s:
            # calculate the ascii value of each letter
            ch = ord(i)

            # multiply the unique prime numbers mapped in the pr list from the difference between the ascii value of letter and a
            ans *=pr[ch-ord("a")]

        # return the unique key
        return ans

strs = ["eat","tea","tan","ate","nat","bat"]
'''
strs = [""]
strs = ["a"]
'''
print("Ungrouped Anagrams: ",strs,"\n")

s = Solution()
print("Grouped Anagrams: ",s.groupAnagrams(strs))
