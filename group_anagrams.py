#time complexity: O(nk)
#space complexity: O(n)

class Solution:
    def groupAnagrams(self, strs):
        self.strs=strs
        hashmap={}
        if (strs==None or len(strs)==0):
            return [[""]]
        for i in strs:
            chars=sorted(list(i))
            string="".join([item for item in chars])
            if string not in hashmap.keys():
                hashmap[string]=[]
                hashmap[string].append(i)
            else:
                hashmap[string].append(i)
        return hashmap.values()
            