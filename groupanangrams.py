class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # creating a hashset
        ans = collections.defaultdict(list)
        for s in strs:
            #Generating a key for every string in strs in following way
            # string: "eat" => key generated:["a","e","t"] 
            key=tuple(sorted(s))
            #appending values for respected keys
            ans[key].append(s)
        return ans.values()