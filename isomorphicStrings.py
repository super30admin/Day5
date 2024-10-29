class Solution:
    def isIsomorphic(s: str, t: str) -> bool:
        sMap = [] #use this for s:t
        tMap = [] #use this for t:s

        if len(s)==[] and len(t)==[]:
            return True
        if len(s)==[] and len(t)!=[] or (len(s)!=[] and len(t)==[]):
            return False
        if len(s)!=len(t):
            return False
        
        
        for i in range(0,len(s)-1):
            sChar = s[i]
            tChar = t[i]
            
            if (sMap[sChar-"a"] != 0):
               if (sMap[sChar-"a"] != tChar):
                   return False
               else:
                   sMap[sChar - "a"] = tChar 

            if (tMap[tChar-"a"] != 0):
               if (tMap[tChar-"a"] != sChar):
                   return False
               else:
                   tMap[tChar - "a"] = sChar

x = Solution.isIsomorphic(s = "hello",t = "world")


