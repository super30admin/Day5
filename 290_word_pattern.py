class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        """
            // Time Complexity: O(n)
                # 'n' the length of the pattern
            // Space Complexity:
                    O(1) Since it is given we will only have
                    lower case  letters, in the worst case the
                    size of each dictionary will never exceed 26
            // Did this code successfully run on Leetcode :
                    Yes
            // Any problem you faced while coding this :
                    Time complexities
        """
        arr_str = str.split()
        if len(pattern) != len(arr_str):
            return False
        ptn_dict = {}
        str_dict = {}
        for i in range(len(pattern)):
            if pattern[i] not in ptn_dict:
                ptn_dict[pattern[i]] = arr_str[i]
            elif ptn_dict[pattern[i]] != arr_str[i]:
                return False

            if arr_str[i] not in str_dict:
                str_dict[arr_str[i]] = pattern[i]
            elif str_dict[arr_str[i]] != pattern[i]:
                return False
        return True
        # # O(n)
        # arr_str = str.split()
        # # O(1)
        # if len(pattern) != len(arr_str):
        #     return False
        # # O(n) and O(1)
        # if len(set(pattern)) != len(set(arr_str)):
        #     return False
        # # O(m+n)
        # values = list(zip(pattern, arr_str))
        # pattern_dict = {}
        # # O(m+n)
        # for key, value in values:
        #     # O(1) and O(1)
        #     if key in pattern_dict and pattern_dict[key] != value:
        #         return False
        #     else:
        #         # O(1)
        #         pattern_dict[key] = value
        # return True


if __name__ == '__main__':
    h = Solution()
    print(h.wordPattern("abba", "dog cat cat fish"))
    # print(h.wordPattern("aaaa", "dog cat cat dog"))
    # print(h.wordPattern("abba", "dog dog dog dog"))
    # print(h.wordPattern("aaaa", "dog cat cat dog"))
    # print(h.wordPattern("aba", "cat cat cat dog"))
