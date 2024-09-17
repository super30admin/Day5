# TIme: O(N * K log K)
# Space: O(N * K)

# Where N is the number of strings in strs
# Where K is the len of longest string
# We sort each string in O(K log K) time

#Approach:

'''
If strings are anagrams, their sorted string would be equal.
'''

class Solution:

    def groupAnagrams(self, strs):
        sorted_strs = {}
        for i in range(len(strs)):
            str_ = ''.join(sorted(strs[i]))
            if str_ in sorted_strs:
                sorted_strs[str_].append(strs[i])
            else:
                sorted_strs[str_] = [strs[i]]
        return list(sorted_strs.values())


if __name__ == "__main__":
    strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
    print(Solution().groupAnagrams(strs))
