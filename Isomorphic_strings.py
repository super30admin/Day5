#Time complexity - O(n)
#space complexity - O(n)
#Problem done in Leetcode - Yes
#Any challenges faced - No

#Algorithm :
#we use two dictionaries to solve the problem .one dictionary is used to store the unique replacement characters from s to t and another dictionary is used to store the unique replacement characters from t to s.while storing the replacements if they dont match with ones that are already present in the dictionary then we return false else we return true.


class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        d=dict()
        d1=dict()
        for i in range(len(s)):
            if s[i] not in d:
                d[s[i]]=t[i]
            else:
                if d[s[i]]!=t[i]:
                    return False
            if t[i] not in d1:
                d1[t[i]]=s[i]
            else:
                if d1[t[i]]!=s[i]:
                    return False
        return True