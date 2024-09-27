#49. Group Anagrams
"""
Time Complexity : O(n)
Space Complexity : O(n)
Success in Leetcode? : YES
Any problem faced? : NO

associate char of string with a prime number and take product.
eg : eat. then its answer should be 11 * 2 * 73
Now, every word having e, a, and t (only) as characters then its answer should be  11 * 2 * 73.
Thus, they make a pair.
key : value in hashmap is int(product of associated prime) : list() (list of all words having same prime product)

"""


class Solution:
    def primeNumbers(self, string):
        prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        result = 1
        for ij in string:
            result = result * prime[ord(ij) - ord('a')] #ord inbuilt function to get ASCII value of any char

        # print(result)
        #result is product with respective prime numbers
        return int(result)

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = dict()

        for s in strs:
            p = self.primeNumbers(s)

            if p in d:
                temp_list = d.get(p)
                temp_list.append(s)

            else:
                d.update({p: []})
                temp_list = d.get(p)
                temp_list.append(s)

        return d.values()