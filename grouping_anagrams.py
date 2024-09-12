class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Time: O(N)
        # Space: O(N)

        groupedStr=collections.defaultdict(list)
        
        for i in strs:
            tempL=[0]*26
            for j,e in enumerate(i):
                tempL[ord(e)-97]+=1
            groupedStr[tuple(tempL)].append(i)

        return groupedStr.values()