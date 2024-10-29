# Time Complexity :O(n) for iteration zip
# Space complexity :O(m) for s and t being used together
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# We will create 2 maps for s:t and t:s. We will zip all elements together so it is easy to unpack them.
#First we will check the 2 flase conditions / value x not present in Map 1 ;but key present t:s -> end loop False
#False condition 2 is if Map 1 value is not equal to y
#otherwise add add map[y] as x and map[x] as y.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # base conditions
        if len(s)=={} and len(t)=={}:
            return True
        if (len(s)=={} and len(t)!={}) or (len(s)!={} and len(t)=={}):
            return False
        if  len(s) != len(t):
            return False


        sMap = {} #use this for s:t
        tMap = {} #use this for t:s

        for x,y in zip(s,t):        # creates (h:j),(e:e),(l:n),(o:y) pairs
            if x not in sMap:       # if x not in m1 [,,,] False condition 1
                if y in tMap:       # but y in m2 [,,,]
                    return False    # Dead End...otherwise
                sMap[x] = y         # smap -> t
                tMap[y] = x         # tmap -> s
            elif sMap[x] != y:      # otherwise False condition 2
                return False
        return True
         