
#Time Complexity: O(n)
#Space Complexity: O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = collections.defaultdict(list)
        
        for _str in strs:
            key = ['0'] * 26
            for char in _str:
                key[ord(char) - 97] = str(int(key[ord(char) - 97]) + 1)
            
            d['_'.join(key)].append(_str)
        
        res = []
        for key in d:
            res.append(d[key])
        
        return res