#TC:O(N) SC:(N)
#hashmap
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False

        dict={}
        for i,val in enumerate(s):
            
            if "s-{}".format(val) not in dict:
                dict["s-{}".format(val)] = t[i]
            elif dict["s-{}".format(val)] != t[i]:
                return False
            if "t-{}".format(t[i]) not in dict:
                dict["t-{}".format(t[i])] = val
            elif dict["t-{}".format(t[i])] != val:
                return False
        return True
