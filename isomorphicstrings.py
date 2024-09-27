'''
Did it run leet code: Yes
Complexity: 
Time: 0(N)
Space: 0(N)



Algorithm:
1. We create two dictionaries for 's' and 't'
2. Traverse through character of `s` and `t` and we add character in dictionary if not found.
3. for the characters at same indexes we also check number of occurences if they are not same, we say
its not isomorphic.
'''


class Solution:
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        dict_s={}
        dict_t={}
        
        counter_s=0
        counter_t=0
        
        for char_s,char_t in zip(s,t):
            
            if char_s not in dict_s:
                dict_s[char_s] = counter_s
                counter_s+=1
            
            if char_t not in dict_t:
                dict_t[char_t] = counter_t
                counter_t+=1

            if dict_s[char_s] != dict_t[char_t]:
                return False
        
        return True