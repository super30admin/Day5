#Time Complexity : O(N)
# Space Complexity = O(1)
# Yes it ran on Leetcode.

class Solution(object):
    def wordPattern(self, pattern, str):
        str_list = str.split(' ')
        # pattern = pattern.split()
        if len(str_list) != len(pattern):
            return False
        dic = {}
        dic_2 = {}
        for i in range(len(pattern)):
            if pattern[i] in dic:
                if dic[pattern[i]] != str_list[i]:
                    return False
            else:
                dic[pattern[i]] = str_list[i]

        for i in range(len(str_list)):
            if str_list[i] in dic_2:
                if pattern[i] != dic_2[str_list[i]]:
                    return False
            else:
                dic_2[str_list[i]] = pattern[i]
        return True
