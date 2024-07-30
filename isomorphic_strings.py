## The TC is O(N)  and SC = O(1)
'''The zip function creates an iterator in O(1) time i.e. let say if s = "egg" and t ="add", then it creates 
(s[0],t[0]),(s[1],t[1]),(s[2],t[2]). Generating the iterator takes O(1) time and iterating over the elements to create tuples is O(n)
Therefore the outer for loop + zip takes n times and the operations inside the loop is O(1), like searching,retrieveing and adding.

'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sHash={}
        tHash={}

        if len(s) != len(t):
            return False

        for sChar,tChar in zip(s,t):
            if sChar in sHash:
                if sHash[sChar] != tChar:
                    return False
            else:
                sHash[sChar] = tChar
            
            if tChar in tHash:
                if tHash[tChar] != sChar:
                    return False
            else:
                tHash[tChar] = sChar
        return True
    

    ##### Using Hasmap and Hashset

    class Solution:
        def isIsomorphic(self, s: str, t: str) -> bool:
            sHash={}
            tHash={}
            hashset = set()

            if len(s) != len(t):
                return False

            for sChar,tChar in zip(s,t):
                if sChar in sHash:
                    if sHash[sChar] != tChar:
                        return False
                else:
                    if tChar in hashset:
                        return False
                    else:
                        sHash[sChar] = tChar
                        hashset.add(tChar)


            return True