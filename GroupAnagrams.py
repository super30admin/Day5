class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        myDict = {}
        for word in strs:
            wordSort = "".join(x for x in sorted(word))
            if wordSort not in myDict.keys():
                myDict[wordSort] = [word]
            else:
                myDict[wordSort].append(word)
        return myDict.values()
        
        