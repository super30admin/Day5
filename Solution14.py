#Time Complexity : O(n)
#Space Complexity:O(n)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict={}
        strs=list(s.split(" "))
        if len(strs)!=len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] in dict.keys():
                if dict[pattern[i]]==strs[i]:
                    continue
                else:
                    return False
            else:
                if strs[i] in dict.values():
                    for key,val in dict.items():
                        if val==strs[i] and pattern[i]!=key:
                            return False
                else:
                    dict[pattern[i]]=strs[i]
        return True