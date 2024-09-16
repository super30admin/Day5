def isIsomorphic(self, s: str, t: str) -> bool:
        
        
        
        s_dic,t_dic = {},{}
        
        for i in range(len(s)):
            s_alpha = s[i]
            t_alpha = t[i]
            
            if s_alpha not in s_dic:
                s_dic[s_alpha] = t_alpha
            if t_alpha not in t_dic:
                t_dic[t_alpha] = s_alpha
            
            if s_dic[s_alpha]!=t_alpha or t_dic[t_alpha]!=s_alpha:
                return False
            
        return True
        
        
        '''
        tc  o(n)
        sc  o(n) + o(n) == o(n)
        isomorphic strings are those where one string can be replace by other with respective index. I have mapped s string to t and converse.
        Will check if the element is not present in the hashtable, then will add key(element in s) and value (respective element in t). Will repeat this for t. 
        If in any case, if element is present in the table and respective element in other string is not equal to the value , return false. Else, true.'''
