# Time-complexity: O(nk), n is input and k is len(word)
# Space-complexity: O(n)
# Solved in Leetcode: yes
# Difficult? No

import collections
import string
class Solution(object):
    def groupAnagrams(self, strs):
        # Sorted tuple method

        # ans = collections.defaultdict(list)
        # for s in strs:
        #     ans[tuple(sorted(s))].append(s)
        # print(ans)
        # return ans.values()

        # Prime Product method
        
        alpha_prime = {}
        ans = collections.defaultdict(list)
        prime_nos = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        
        alphabets = list(string.ascii_lowercase)
        for i in range(len(alphabets)):
            alpha_prime[alphabets[i]] = prime_nos[i]
        for s in strs:
            product = 1
            for c in s:
                product *= alpha_prime[c]
            ans[product].append(s)
        return ans.values()

obj = Solution()
print(obj.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))