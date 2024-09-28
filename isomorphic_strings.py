class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        #time complexity O(n)
        dict_s = {}
        dict_t = {}
        
        for i in range(len(s)):
            char_s = s[i]
            char_t = t[i]
            
            if char_s in dict_s:
                if dict_s[char_s]!=char_t:
                    return False
            else:
                dict_s[char_s]=char_t
                
            if char_t in dict_t:
                print(char_t)
                if dict_t[char_t]!=char_s:
                    return False
            else:
                dict_t[char_t]=s[i]
        return True
            