#Time complexity: O(n)
# Space complexity: O(n)
# Worked on leetcode
# The algorithm checks if the mapping is one to one from a string s-> pattern t, and vice versa,
# by creating 2 hashmaps. If any of the one-on-one mapping condition is violated in either of the 2
# hashmaps, it returns False



class Solution:
    def wordPattern(self, string: str, pattern: str) -> bool:
        pattern = pattern.split()  # split by space
        print(pattern, string)

        if len(pattern) != len(string):
            return False

        else:

            Hashmap = {}
            for index in range(len(pattern)):
                if pattern[index] in Hashmap.keys():
                    if Hashmap[pattern[index]] != string[index]:
                        return False
                else:
                    Hashmap[pattern[index]] = string[index]

            Hashmap = {}
            for index in range(len(string)):
                if string[index] in Hashmap.keys():
                    if Hashmap[string[index]] != pattern[index]:
                        return False
                else:
                    Hashmap[string[index]] = pattern[index]

            return True


