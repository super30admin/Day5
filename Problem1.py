class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = dict()
        for i in range(len(strs)):
            # key = strs[i].sort()
            key = ''.join(sorted(strs[i]))
            if key in hashmap.keys():
                hashmap[key].append(strs[i])
            else:
                hashmap[key] = []
                hashmap[key].append(strs[i])
        returnlist = []
        for k in hashmap.keys():
            returnlist.append(hashmap[k])
        return returnlist

            
