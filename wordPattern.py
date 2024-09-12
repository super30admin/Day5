#Time Complexity O(n)
class Solution(object):
    def wordPattern(self, pattern, str):
        if not pattern and str:
            return False
        else:
            a = {}
            b = {}
            array = str.split(' ')
            if len(pattern) != len(array):
                return False
            else:
                for i in range(len(pattern)):
                    if pattern[i] not in a:
                        a[pattern[i]] = array[i]
                    else:
                        if a[pattern[i]] != array[i]:
                            return False
                for j in range(len(array)):
                    if array[j] not in b:
                        b[array[j]] = pattern[j]
                    else:
                        if b[array[j]] != pattern[j]:
                            return False
            return True
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
