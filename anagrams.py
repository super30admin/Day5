class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = {}
        
        for s in strs:
            charCheck = [0] * 26
            for c in s:
                charCheck[ord(c) - 97] += 1
            keyString = ' '.join([str(k) for k in charCheck])
            result[keyString] = result.get(keyString, [])
            result[keyString].append(s)
        
        return result.values()