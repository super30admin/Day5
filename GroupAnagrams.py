# TC: O(NK), K is the length of string
# SC: O(1) as alphabets(26) being used as constant in size always

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic = collections.defaultdict(list)
        for i in strs:
            d = [0]*26
            for j in i:
                d[ord(j)-ord('a')] += 1
            dic[tuple(d)].append(i)
        return dic.values()
