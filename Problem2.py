#Approach : Maintaing two hashmaps and check if there exists one-to-one mapping for each char in the str. If there return True else False
#Time Complexity : O(n)
#Space Complexity : O(1) --> max length of each hashmap is 26 
class Solution(object):
    def isIsomorphic(self, s, t):
        s_hashmap = {}
        t_hashmap ={}
        
        if(len(s)!=len(t)):
            return False
        
        else:
            for i in range(0,len(s)):
                if(s_hashmap.has_key(s[i])):
                    if(s_hashmap.get(s[i])==t[i] and t_hashmap.get(t[i])==s[i]):
                        continue
                    else:
                        return False
                else:
                    if(t_hashmap.has_key(t[i])):
                        return False
                    temp = t[i]
                    s_hashmap[s[i]] = t[i]
                    t_hashmap[temp] = s[i]
        return True
                   
                
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        
