#Time complexity:O(n)
#sapce complexity: O(n)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict1={}
        words=s.split(" ")
        if len(words)!=len(pattern):
            return False
        else:
            for i in range(len(words)):
                if words[i] not in dict1:
                    dict1[words[i]]=pattern[i]
                else:
                    if pattern[i]!=dict1[words[i]]:
                        return False
        print(dict1)
        if len(set(dict1.values()))!=len(dict1):
            return False
        return True
        
        