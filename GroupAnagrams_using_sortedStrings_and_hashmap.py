#// Time Complexity :O(n*mlogm) #n is no of strings and m is the average size of each word
#// Space Complexity :O(nk) # k is the no of strings in each group
#// Did this code successfully run on Leetcode :yes
#// Any problem you faced while coding this :no

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap={}
        for i in strs:
            x=sorted(i)
            x=tuple(x)
            if x in hashmap:
                hashmap[x].append(i)
            else:
                hashmap[x]=[]
                hashmap[x].append(i)
        subgroup=[]
        for i in hashmap:
            subgroup.append(hashmap[i])
        return subgroup