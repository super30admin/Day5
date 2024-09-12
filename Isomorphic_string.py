
# // Time Complexity : # O(2n) or O(n) 
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # dictionary to sotre mapping char from s to t
        stdict={}
        # dictionary to sotre mapping char from t to s
        tsdict={}
        
        #as len(s) and len(t) are equal
        for i in range(len(s)):
            #character at i index in s
            chs=s[i]
                #character at i index in t
            cht=t[i]
            #check if reverse mapping is True/False
            if (chs in stdict and stdict[chs]!= cht) or (cht in tsdict and tsdict[cht]!=chs):
                return False
                
           #add the mapping to dictionary
            stdict[chs]=cht
            
            tsdict[cht]=chs
        return True