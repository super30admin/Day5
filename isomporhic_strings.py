class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        #make two maps for 1:1 mapping
        mps={}
        mpt={}
        
       #base case if lengths are mismatched..return F
        if len(s)!=len(t):
            return False
        #traverse any array as anyways lengths are equal
        for i in range(len(s)):
            #if key already in map, check if its value equals char in t, if not>>return F
            if s[i] in mps:
                if mps[s[i]]!=t[i]:
                    return False
            #if new key, add in map
            else:
                mps[s[i]]=t[i]

            ##repeat for 2nd map
            if t[i] in mpt:
                if mpt[t[i]]!=s[i]:
                    return False
            else:
                mpt[t[i]]=s[i]
        #covered above cases for nonisomorphic already
        return True

#O(N)>>traverse map
#O(1)>> store at max 26 lowercase alphabets that means O(26), never depends on input string lengths
            
                
                
                       
            