## Space COmplecity =O(n)
## Time COmplexity O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        st, ts = {}, {}
        if len(s) != len(t):
            return False


        for x,y in zip(s,t):
            if x in st:
                if st[x] != y:
                    return False
            if y in ts:
                if ts[y] != x:
                    return False
            st[x] = y
            ts[y] = x

        return True
