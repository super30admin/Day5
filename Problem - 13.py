#time complexity : O(mnlog(n)) . I understood m is for traversing but I didn't understand why nlog(n)? can you please explain?
#space complexity is o(n)
#Approach : First sorting each string in a list and then storing each key and it's values in a hashmap.
# Yes it passed all thetest cases in leet code

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        hash_map={} #empty dictionary
        for i in range(len(strs)):
            sorted_str="".join(sorted(strs[i])) #sorting the each string
            if sorted_str not in hash_map.keys(): 
                hash_map[sorted_str]=[strs[i]]
            else:
                hash_map[sorted_str].append(strs[i])
        return hash_map.values()
    
    
# another solution 

class Solution:
    def groupAnagrams(self, strs):
        hash_map = dict()
        for i in range(0, len(strs)):
            sorted_str = "".join(sorted(strs[i]))
            val = hash_map.get(sorted_str, [])
            val.append(strs[i])
            hash_map[sorted_str] = val
        return hash_map.values()