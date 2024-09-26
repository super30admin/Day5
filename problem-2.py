#Time complexity O(n) and space complexity O(n)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
#Initializing dictionary to store values from both strings one being key
        dict={}
        
        for i in range(len(s)):
#checking to see if dupliacte values are not in the dictionary if its there then returning false
            if s[i] not in dict:
                if t[i] in dict.values():
                    return False
                dict[s[i]] = t[i]
            elif dict[s[i]]!=t[i]:
                return False
            
                
        return True
