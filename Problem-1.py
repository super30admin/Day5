# Group Anagrams

# Time Complexity: O(N * mlogm), where N is len(strs) and m is length of each string in `strs`
# Space Complexity: O(N)
# Did it run on Leetcode: Yes
# Any problems: N/A

def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    
    hsh = {}
    for s in strs:
        key = ''.join(sorted(s))
        if key in hsh:
            hsh[key].append(s)
        else:
            hsh[key] = [s]
    
    res = []
    for k, v in hsh.items():
        res.append(v)
    return res
