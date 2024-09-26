# Space Complexity: O(n)
# Time Complexity:O(nl) l: length of each word

class Solution(object):
    #Defined a function to get the unique multiplication of character
    # values in word using prime numbers for 26 alphabets
    def primeFactor(self, s):
        result = 1
        prime_numbers = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                         101]

        for i in range(len(s)):
            result = result * prime_numbers[ord(s[i]) - ord('a')]
        return result

    def groupAnagrams(self, strs):
        map_list = {}
        for i in range(len(strs)):
            res = self.primeFactor(strs[i])
            print(res)
            if res in map_list:
                map_list[res].append(strs[i])
            else:
                map_list[res] = [strs[i]]

        return map_list.values()

        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
