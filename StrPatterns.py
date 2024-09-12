# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """

        def hashmapImpl():
            char_map = {}
            string_map = {}
            char_length = len(pattern)
            str_array = s.split(" ")
            string_length = len(str_array)

            if(char_length != string_length):
                return False

            for index in range(char_length):
                char = pattern[index]
                string = str_array[index]

                if not char_map.has_key(char):
                    char_map[char] = string
                else:
                    if char_map[char] != string:
                        return False
                if not string_map.has_key(string):
                    string_map[string] = char
                else:
                    if string_map[string] != char:
                        return False
            return True

        # def oneMapImpl():

        return hashmapImpl()
