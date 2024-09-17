#Time complexity - O(n)
#space complexity - O(n)
#Problem done in Leetcode - Yes
#Any challenges faced - No

#Algorithm :
#we use two dictionaries to solve the problem .one dictionary is used to store the unique replacement values from pattern to str and another dictionary is used to store the unique replacement characters from str to pattern.while storing the replacements if they dont match with ones that are already present in the dictionary then we return false.else we return true

class Solution(object):
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        d=dict()
        d1=dict()
        str1=list(str.split())
        if len(str1)!=len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in d:
                d[pattern[i]]=str1[i]
            else:
                if d[pattern[i]]!=str1[i]:
                    return False
            if str1[i] not in d1:
                d1[str1[i]]=pattern[i]
            else:
                if d1[str1[i]]!=pattern[i]:
                    return False
        return True
            
        