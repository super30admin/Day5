'''
Time complexity: O(n)
Space complexity: O(1)
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        dicts = {}
        dictt = {}
        
        for i, j in zip(s,t):
            if i in dicts:
                if dicts[i]!= j:
                    return False
            else:
                dicts[i] = j

            if j in dictt:
                if dictt[j] != i:
                    return False
                else:
                    dictt[j] = i

        return True

s = Solution()
print(s.isIsomorphic('egg','add'))
print(s.isIsomorphic('foo','bar'))
print(s.isIsomorphic('eg','add'))
print(s.isIsomorphic('paper','title'))          