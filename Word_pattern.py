'''
TC: O(N), SC: O(1)

Same as isomorphic string problem. Only diff is I had to split the string to List.
'''

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        patternMap={}
        stringMap={}
        s_words = s.split()

        if len(pattern) != len(s_words):
            return False

        for patChar,strChar in zip(pattern,s_words):
            if patChar in patternMap:
                if patternMap[patChar] != strChar:
                    return False
            else:
                patternMap[patChar] = strChar

            if strChar in stringMap:
                if stringMap[strChar] != patChar:
                    return False

            else:
                stringMap[strChar] = patChar

        return True


        