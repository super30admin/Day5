# Time Complexity : O(N) (Where N is length of S or T)
# Space Complexity : O(N) 
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# - Start with every charcter in S and if that char comes first time store it in dictionary and assign it's value from T
# - If that char is already in dictionary than compare it's mapping to the same indexed character in T, and if mapping is different return False.
# - Follow the same above steps on T. In the end return True (that means mapping is correct in both the cases).


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
#       Initialize two dictionary
        front, back = {}, {}
        
#       Not required because of problem defination but just in case.
        if len(s) != len(t):
            return False
        
#       iterate over every charcter of S.
        for i in range(len(s)):
#           If char is in dictionary, check that it's mappinf to charcter of T is similer to current character of T.
            if s[i] in front:
                if front[s[i]] != t[i]:
#                   If not return False
                    return False
#           If char is new than store it's mapping to T's char.
            else:
                front[s[i]] = t[i]
            
        # Follow same steps for t.
        for i in range(len(t)):
            if t[i] in back:
                if back[t[i]] != s[i]:
                    return False
            else:
                back[t[i]] = s[i]
        # In the end return True        
        return True
            
