#Time Complexity : O(N) where N is the number of characters  
#Space Complexity : O(1) We are using constant number of caharacter spaces 
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : 

#Your code here along with comments explaining your approach


class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        
        if len(s)!=len(t):
            return False
        
        s_dict=[-1]*256
        t_dict=[False]*256
        
        for i in range(len(s)): 
            if s_dict[ord(s[i])]==-1: 
                if t_dict[ord(t[i])]==True: 
                    return False
                t_dict[ord(t[i])]=True
                s_dict[ord(s[i])]=t[i]
            elif s_dict[ord(s[i])]!=t[i]:
                return False
        return True    