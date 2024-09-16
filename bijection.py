class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = list(s.split(" "))
        #print(s)
        char_dict ={}
        if len(s) !=len(pattern):
            return False
        for i in range(len(s)):
            key,val = s[i], pattern[i]
            if key in char_dict.keys():
                if not (char_dict[key] == val):
                    return False
            else :
                if val in char_dict.values():
                    return False
                char_dict[key] = val
        
        return True

# new = Solution()
# new.wordPattern("abba","dog cat cat dog")