# Time Complexity : O(N*LlogL) #L - len of string, N no. of strings
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO

class Solution:
    def groupAnagrams(self, strs):
        hashmap = {}

        for s in strs:
            x = "".join(sorted(s))
            if hashmap.get(x)!=None:
                hashmap[x].append(s)
            else:
                hashmap[x]=[s]
        
        return hashmap.values()


obj = Solution()
arr = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(obj.groupAnagrams(arr))

