"""
Time : 0(n)
Space: 0(n) but n is char -- 256
Approach: Map and Set
    Add pair to Map if not there. Simultaneously add char to set if not there.
    If we have a mismatch, return invalid. 
"""
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        """
        examples: 
            s = f o o
            t = b a r

            s = e g d
            t = a d a

            s = a b b a
            t = g d d g
        """

        sMap = {}
        tSet = set()


        for i in range(0,len(s)):
            sChar = s[i]
            tChar = t[i]

            # check for sMap, check for tSet also
            if sChar not in sMap:
                
                sMap[sChar] = tChar

                # add to tSet -- if not there
                if tChar not in tSet:
                    tSet.add(tChar)
                
                else:
                    return False
            
            elif sMap[sChar] != tChar:
                return False
        
        # end of for loop

        return True

