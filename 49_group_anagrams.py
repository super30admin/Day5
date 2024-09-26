from math import inf


class Solution:
    # def groupAnagrams(self, strs: [str]) -> [[str]]:
    # """
    #     // 'n' is the number of strings,
    #     //'k' is the average length of the string
    #
    #     // Time Complexity: O(nklogk)
    #     // Space Complexity: O(nk)
    #         We need to store all the keys and values.
    #     // Did this code successfully run on Leetcode :
    #         Yes
    #     // Any problem you faced while coding this :
    #         I forget how to use the join function.
    #         Had to look at the documentation
    #     // Your code here along with comments explaining your approach:
    #         I am sorting each word. If the sorted word already exists in the
    #         dict then we know the original word should be part of that group.
    #         I am storing the sorted word corresponding to the original words in
    #         the dictionary.
    # """
    # str_dict = {}
    # # traversing whole list O(n)
    # for words in strs:
    #     # join takes O(k)
    #     # sorted takes O(klogk)
    #     cur = ''.join(sorted(words))
    #     # check if cur exists O(1)
    #     if cur in str_dict:
    #         # to append to the list O(1)
    #         str_dict[cur].append(words)
    #     else:
    #         # to create a new list O(1)
    #         str_dict[cur] = [words]
    # # traversing whole dict to get all values O(n)
    # return str_dict.values()

    def __init__(self):
        self.prime_nums = self._generate_prime_numbers(26)

    def groupAnagrams(self, strs: [str]) -> [[str]]:
        """
            // 'n' is the number of strings,
            //'k' is the average length of the string

            // Time Complexity: O(nk)
            // Space Complexity: O(nk)
                We need to store all the 'n' values and
                each value is on average of size 'k'
            // Did this code successfully run on Leetcode :
                Yes
            // Any problem you faced while coding this :
                I forget how to use the join function.
                Had to look at the documentation
            // Your code here along with comments explaining your approach:
                I am sorting each word. If the sorted word already exists in the
                dict then we know the original word should be part of that group.
                I am storing the sorted word corresponding to the original words in
                the dictionary.
        """
        str_dict = {}
        # traversing whole list O(n)
        for word in strs:
            # O(k)
            cur = self._calculate_key(word)
            # check if cur exists O(1)
            if cur in str_dict:
                # to append to the list O(1)
                str_dict[cur].append(word)
            else:
                # to create a new list O(1)
                str_dict[cur] = [word]
        # traversing whole dict to get all values O(n)
        return str_dict.values()

    def _calculate_key(self, key: str) -> int:
        print(self.prime_nums)
        result = 1
        for i in key:
            result *= self.prime_nums[ord(i) - ord('a')]
        return result

    def _generate_prime_numbers(self, no: int) -> list:
        # a number that is divisible by itself and 1
        start = 2
        result = []
        i = 2
        while True:
            is_Prime = True
            for j in range(2, i):
                if i % j == 0:
                    is_Prime = False
                    break
            if is_Prime:
                result.append(i)
            if len(result) == no:
                break
            i += 1
        return result

    # def groupAnagrams(self, strs: [str]) -> [[str]]:
    #     # from collections import defaultdict
    #     h = {}
    #     for a in strs:
    #         s = 97
    #         res = [0] * 26
    #         for i in a:
    #             res[ord(i) - s] += 1
    #         if tuple(res) in h:
    #             h[tuple(res)].append(a)
    #         else:
    #             h[tuple(res)] = [a]
    #     return h.values()


if __name__ == '__main__':
    h = Solution()
    print(h.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
