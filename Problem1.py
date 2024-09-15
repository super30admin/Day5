class Problem1:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        """
        convert strings to counts by using their ASCII value and then group the into dictionary 
        O(NK) where n is no of string and K is maximum length of string
        
        Space complexity O(NK) for res dict
        """
        res=collections.defaultdict(list)
        for word in strs:
            count=[0]*26
            for c in word:
                count[ord(c)-ord("a")]+=1
            res[tuple(count)].append(word)
            #print(res)
        return res.values()
        