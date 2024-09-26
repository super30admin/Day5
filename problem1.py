# Time Complexity : O(n)
# Space Complexity:o(n)
#  Did this code successfully run on Leetcode : Yes

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        prime_number = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                        101]
        hashMap = {}

        for str in strs:
            # calculate key
            key = 1
            for i in str:
                key = key * prime_number[ord(i) - ord('a')]
            if key not in hashMap:
                listStr = [str]
                hashMap[key] = listStr
            else:
                hashMap[key].append(str)

        return hashMap.values()


