class Solution:#timr O(n) and space O(n)
    def wordPattern(self, pattern: str, s: str) -> bool:
        dic={}
        st=s.split()
        if len(pattern)!=len(st):return False
        for i in range(len(pattern)):
            if pattern[i] in dic and dic[pattern[i]]!=st[i]:
                return False
            if pattern[i] not in dic and st[i] in dic.values() :
                return False
            else:
                dic[pattern[i]]=st[i]
        return True
