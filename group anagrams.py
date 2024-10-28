class Solution:
    def hashFunction(self, str):
        dic = {'a': 2,'b': 3,'c': 5,'d': 7,'e': 11,'f': 13,'g': 17,'h': 19,'i': 23,'j': 29,'k': 31,'l': 37,'m': 41,'n': 43,'o': 47,'p': 53,'q': 59,'r': 61,'s': 67,'t': 71,'u': 73,'v': 79,'w': 83,'x': 89,'y': 97,'z': 101}
        hashVal = 1
        for s in str:
            hashVal *= dic[s]
        return hashVal

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic = {}
        for s in strs:
            hashVal = self.hashFunction(s)
            if hashVal in dic.keys():
                dic[hashVal].append(s)
            else:
                dic[hashVal] = [s]
        
        ret = []
        for key in dic.keys():
            ret.append(dic[key])
        return ret
