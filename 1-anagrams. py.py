# time O(m*n) 
#space - O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hash = {}
        for _str in strs:
            arr = [0]*26
            for alphabet in _str:
                arr[ord(alphabet)-97] +=1
            key = tuple(arr)
            if key not in hash:
                hash[key] = [_str]
            else:
                hash[key].append(_str)

        return hash.values()