'''
Time Complexity: O(n)
Space Complexity: O(n) depending on the number of elements. But can be O(1)
Leetcode: Success!
Problem: None. Confused between the TC -> O(1) or O(n)
'''

class Solution:
    def isIsomorphic(self, s, t):
        # Initialize the hashmaps for mapping characters from s to t and t to s
        sToThm = {}
        tToShm = {}

        # Sanity check for checking if the length is equal or if the strings are empty.
        if len(s)==0 or len(t)==0 or len(s)!=len(t):
            return False
        # initialize the characters from s and t
        for i in range(len(s)):
            print(s[i],t[i])
            chs = s[i]
            cht = t[i]
        # check if chs is present in hashmap mapping s to t and if it maps from s to t
            if (chs in sToThm and sToThm[chs]!=cht):
                return False
        # if not then add to the hashmap
            else:
                sToThm[chs] = cht
        # check if cht is present in hashmap mapping t to s and if it maps from t to s
            if (cht in tToShm and tToShm[cht]!=chs):
                return False
        # if not then add to the hashmap
            else:
                tToShm[cht]=chs
        print(sToThm)
        print(tToShm)
        # return true if no False is returned as that would be true!
        return True

s = "eggg"
t = "addf"

"""
s = "egg"
t = "add"
s = "paper"
t = "title"
"""
sol = Solution()
boolVal = sol.isIsomorphic(s,t)
print(boolVal)
