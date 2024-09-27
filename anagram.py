// Time Complexity :o(nklogn)
// Space Complexity :o(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution(object):
    def groupAnagrams(self, strs):
        dict={}
        for i in strs:
            temp=" "
            for j in sorted(i):
                temp+=j
            if temp in dict:
                dict[temp].append(i)
            else:
                dict[temp]=[i]
        return list(dict.values())
        
