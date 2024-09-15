def isIsomorphic(s, t):
        #mapping should be unique
        #character can map to itself
        
        #create a dictionary
        d = {}
        for i in range(len(s)):
            char1 = s[i]
            char2 = t[i]
            if char1 not in d:
                #checking duplicate mapping
                if char2 in d.values():
                    return False
                    
                #mapping the character from s to t
                d[char1] = char2
                
            elif d[char1] != char2:
                return False
        return True

print(isIsomorphic("add", "egg"))
print(isIsomorphic("foo", "bar"))
