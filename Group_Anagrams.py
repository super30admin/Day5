# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this solution : No
# make a hashmap key:sorted string, values: unsorted strings of the equivalent sorted string 
# loop it through the list, return all the hash values
def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hash = dict()
        for i  in strs:
            i_sorted = ''.join(sorted(i))
            # print(i,i_sorted)
            if hash.get(i_sorted) == None:
                hash[i_sorted] =[i]
            else:
                hash[i_sorted].append(i)
        return hash.values()