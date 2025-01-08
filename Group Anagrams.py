class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict={}

        for s in strs:
            sortstrs=''.join(sorted(s))
            if sortstrs not in dict:
                dict[sortstrs]=[]

            dict[sortstrs].append(s)

        return list(dict.values())