#Time COmplexity =O(n)
#Space Complexity=O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict={}
        for i in range(len(s)):
            if s[i] in dict.keys():
                if dict[s[i]]==t[i]:
                    continue
                else:
                    return False
            else:
                dict[s[i]]=t[i]
            if t[i] in dict.values():
                for key,val in dict.items():
                    if val==t[i] and s[i]!=key:
                        return False
        return True