#time complexity O(nk)
#space complexity (1) as string has specific charcter only
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hash={}
        ss=s.split(' ')
        if pattern==[] or len(pattern)==0 or len(pattern)!=len(ss):
            return False

        ss[0]
        count=0
        for p in pattern:
            if p not in hash and ss[count] in hash.values():
                return False
            if p not in hash :
                hash[p]=ss[count]
                print(hash)
            else:
                if hash[p]!=ss[count]:
                    return False
            count +=1

        return True
