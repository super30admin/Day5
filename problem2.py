#time complexity O(nk)
#space complexity (1) as string has specific charcter only
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hash={}

        if t=="" or len(t)==0 or len(t)!=len(s):
            return True
        count=0
        for p in t:#( travers input string )
            if p not in hash and s[count] in hash.values():
                return False
            if p not in hash :# to chk element in hash or not(k)
                hash[p]=s[count]
                print(hash)
            else:
                if hash[p]!=s[count]:
                    return False
            count +=1

        return True
        
