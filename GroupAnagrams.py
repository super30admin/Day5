# TC: O(N*Klog K) where N is the length of input string and K is the average length of each string in input list.
# SC: O(N)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict = {}
        for i in range(len(strs)):
            string1 = "".join(sorted(strs[i]))
            if string1 in dict:
                l = dict.get(string1)
                l.append(strs[i])
                dict[string1] = l
            else:
                dict[string1] = [strs[i]]
        
        final = [dict[k] for k in dict]
        return final
