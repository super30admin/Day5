# Time: O(n * k log k)
# Space: O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict_str = {}
        for i in range(0, len(strs)): # Time: n 
            sorted_str = "".join(sorted(strs[i])) # time: k log k , space: k
            if sorted_str in dict_str:
                dict_str.get(sorted_str).append(strs[i])  # time: const, space: n
            else:
                dict_str[sorted_str] = [strs[i]] # time: const, space: const 
        return list(dict_str.values()) # time: O(n) space: none
