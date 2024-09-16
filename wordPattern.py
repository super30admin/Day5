'''
Time Complexity: O(n)
Space Complexity: O(n) depending on the number of elements. But can be O(1)
Leetcode: Success!
Problem: None. Confused between the TC -> O(1) or O(n)
'''

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # Initialize the hashmaps for mapping characters from s to pattern and pattern to s
        pTos = {}
        sTop = {}
        ss = s.split(" ")
        print(ss)

        # Sanity check for checking if the length is equal or if the strings are empty.
        if len(pattern) == 0 or len(ss) == 0 or len(ss) != len(pattern):
            return False

        # initialize the characters from ss and pattern
        for i in range(len(pattern)):
            chp = pattern[i]
            chss = ss[i]
            print("chp:",chp)
            print("chss:",chss)

            # check if chp is present in hashmap mapping pattern to ss and if it maps from pattern to ss
            if(chp in pTos and pTos[chp]!=chss):
                return False
            else:
                pTos[chp] = chss

            # check if chss is present in hashmap mapping ss to pattern and if it maps from ss to pattern
            if (chss in sTop and sTop[chss] != chp):
                return False
            else:
                sTop[chss] = chp
        # return true if no False is returned as that would be true!
        return True



pattern = "abba"
s = "dog cat cat dog"
'''
pattern = "abba"
s = "dog cat cat fish"

pattern = "aaaa"
s = "dog cat cat dog"

pattern = "abba"
s = "dog dog dog dog"
'''

sol = Solution()
res = sol.wordPattern(pattern,s)
print("Does it match? : ",res)
