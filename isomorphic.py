class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        char_dict ={}
        for i in range(len(s)):
            key,val = s[i], t[i]
            #print(char_dict, key,val)
            if key in char_dict.keys():
                
                if not (char_dict[key] == val):
                    return False
            else :
                if val in char_dict.values():
                    return False
                char_dict[key] = val
        
        return True


# new = Solution()
# new.isIsomorphic("egg","add")