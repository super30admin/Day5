class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        """
            // Time Complexity: O(n)
                Since the length of both the strings are equal O(2n)
                # 'n' is the number of elements in the strings
            // Space Complexity:
                    The range of values is always from 'a' to 'z'
                    O(1)
            // Did this code successfully run on Leetcode :
                Yes
            // Any problem you faced while coding this :
                Time complexities
        """
        s_dict = {}
        t_dict = {}
        for i in range(len(s)):
            if s[i] not in s_dict:
                s_dict[s[i]] = t[i]
            elif s_dict[s[i]] != t[i]:
                return False
            if t[i] not in t_dict:
                t_dict[t[i]] = s[i]
            elif t_dict[t[i]] != s[i]:
                return False
        return True
        # # creating set O(n)
        # # comparison O(1)
        # if len(set(s)) != len(set(t)):
        #     return False
        # # zip function takes O(m+n)
        # # the list functions takes O(n) to convert the
        # # zip object to the list
        # zipped = list(zip(s, t))
        # results = {}
        # # traversing O(m+n)
        # for key, value in zipped:
        #     # to check if key exists O(1)
        #     # to check if value is similar O(1)
        #     if key in results and results[key] != value:
        #         return False
        #     else:
        #         # assign O(1)
        #         results[key] = value
        # return True


if __name__ == '__main__':
    h = Solution()
    print(h.isIsomorphic("egg", "add"))
    print(h.isIsomorphic("ab", "aa"))
    print(h.isIsomorphic("foo", "bar"))
