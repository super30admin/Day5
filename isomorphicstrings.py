# Time Complexity - O(n)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        else:

            a = {}
            b = {}

            for i,j in zip(s,t):

                if i in a:
                    if a[i] != j:
                        return False
                else:
                    a[i] = j

                if j in b:
                    if b[j] != i:
                        return False

                else:
                    b[j] = i

            return True