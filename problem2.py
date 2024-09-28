# time complexity: O(n)
# space complexity: O(1) as the array size is fixed to 256

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # if both are null
        if not s or not t:
            return False

        if len(s)!=len(t):
            return False

        #using hashmaps
        # sMap = {}
        # tMap = {}

        # for i in range(len(s)):
        #     sChar = s[i]
        #     tChar = t[i]

        #     if sChar in sMap:
        #         if sMap[sChar] != tChar:
        #             return False
        #     else:
        #         sMap[sChar] = tChar

        #     if tChar in tMap:
        #         if tMap[tChar] != sChar:
        #             return False
        #     else:
        #         tMap[tChar] = sChar
        
        # return True



        # using array with linear chaining
        sArr = [-1]*256
        tArr = [-1]*256

        for i in range(len(s)):
            #getting ascii value of the character
            sChar = ord(s[i])
            tChar = ord(t[i])

            # if it doesnt exist, map it
            if sArr[sChar] == -1:
                sArr[sChar] = tChar
            else:
                if sArr[sChar] != tChar:
                    return False
            
            if tArr[tChar] == -1:
                tArr[tChar] = sChar
            else:
                if tArr[tChar] != sChar:
                    return False
        
        return True