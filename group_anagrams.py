class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        xx = {x:random.randint(101, 50000) for x in string.ascii_lowercase}
        mapping = defaultdict(lambda: [])
        for s in strs:
            summation = 0
            for k in s:
                summation += (ord(k)+xx[k])
            mapping[summation].append(s)
        return mapping.values()