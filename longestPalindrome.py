#Leetcode Problem : 409
#first add to set if already present in set remove from set and add 2 to count. At the end if there are elements
#in the set then return count+1 else return count

class Solution:
    def longestPalindrome(self, s):
        count=0
        c=set()
        for i in s:
            if i not in c:
                c.add(i)
            else:
                count+=2
                c.remove(i)
        if c:
            return count+1
        else:
            return count

#TC: O(n)
#SC:O(1)