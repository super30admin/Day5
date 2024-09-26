#Two Hash Method
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict1=dict()
        dict2=dict()
        sList=s.split(" ")
        if len(pattern)!=len(sList):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in dict1.keys():
                dict1[pattern[i]]=sList[i]
            if pattern[i] in dict1.keys() and dict1[pattern[i]]!=sList[i]:
                return False
            if sList[i] not in dict2.keys():
                dict2[sList[i]]=pattern[i]
            if sList[i] in dict2.keys() and dict2[sList[i]]!=pattern[i]:
                return False
        return True

#hashMap and HashSet Method
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict1=dict()
        set1=set()
        sList=s.split(" ")
        if len(sList)!=len(pattern):
            return False
        for i in range(len(sList)):
            if pattern[i] not in dict1.keys() and sList[i] in set1:
                return False
            if pattern[i] in dict1.keys() and dict1[pattern[i]]!=sList[i]:
                return False
            dict1[pattern[i]]=sList[i]
            set1.add(sList[i])
        return True
        