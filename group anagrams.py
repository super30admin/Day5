# Time Complexity: O(n(klogk + k)) + O(n) ---> O(n klogk)
# klogk for sorting, +k for hasing, n for iterating and O(n) for traversing in hashmap

# Space Complexity: O(nk), n and k, where n is len of list and k is len of string if in worst case it creates each key having each list
# Executed successfully and accepted in Leetcode

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        temp = {}
        for i in strs:
            a = ''.join(sorted(i))
            print(a)
            if a not in temp:
                temp[a] = [i]
            elif a in temp:
                temp[a].append(i)
        return temp.values()


# Better Solution
'''
LOGIC - Prime product of anagrams are going to be same. 
As if we use normal numbers, due to factors it will not work like (4*2 and 8*1 will be same)
Sum doesn't work in most of the pattern cases, even in here (17+3 and 7+13)

Time Complexity : O(nk), where n is the length of the list and k is the length of the string
Space Complexity : O(nk)
Successfully executed all the test cases
'''
class Solution:
    def prime_product(self, s):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        product = 1
        for i in range(len(s)):
            product *= primes[ord(s[i])-ord('a')]
        return product
            
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        temp = {}
        for i in strs:
            product = self.prime_product(i)
            if product not in temp:
                temp[product] = [i]
            else:
                temp[product].append(i)
        return temp.values()

#Check with XOR