# Time Complexity : O(len of list * max len of word in it)
# Space Complexity :O(len of list * max len of word in it)


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = collections.defaultdict(list)
        for s in strs:
            #create a list with length of 26
            count = [0] * 26
            #count the occurances of each letter and increment it by 1
            for c in s:
                count[ord(c) - ord("a")] += 1
            ans[tuple(count)].append(s)
        #return the values of the dictionary as they will have the anagram words combined together
        return ans.values()
