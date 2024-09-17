# Time Complexity : O(nk), where n is len(strs) and k is the length of each string in strs
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes!
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
class Solution(object):
    # making a dictionary with prime number product of all ascii
    # values of a string as key (reduces lookup time to O(1))
    # and all different combinations of characters present
    # in input as an array value and returning the values
    primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
    def primeProduct(self, string):
        result = 1
        for i in string:
            result *= self.primes[ord(i) - ord('a')]
        return result


    def groupAnagrams(self, strs):
        store = {}
        for i in strs:
            key = self.primeProduct(i)
            if not key in store:
                store[key] = []
            store[key].append(i)

        return store.values()


strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(Solution().groupAnagrams(strs))
