class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:

        smap = {}
        
        for string in strs:
            #liststr = list(string)
            sortstr = sorted(string)
            sortstr = ''.join(sortstr)
            if sortstr in smap:
                smap[sortstr].append(string)
                
            else:
                smap[sortstr] = [string]
                

        return smap.values()