#is isomorphic
#SC:O(N)
#TC:O(N)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        def helper(word):
            output = []
            lookup = {}
            count=1
            for w in word:
                if w not in lookup:
                    lookup[w]=count
                    count+=1
                output.append(lookup[w])
            return output
        return helper(s)==helper(t)