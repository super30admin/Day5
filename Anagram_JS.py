#Time complexity: O(n)
#Space Complexity:O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        L = {}
        for i in strs:
            temp = sorted(i)
            temp1 = "".join(temp)
            if temp1 in L:
                L[temp1].append(i)
            else:
                L[temp1]=[i]
        result = []
        for key in L:
            result.append(L[key])
        return result
            