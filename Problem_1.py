# Search in roatated array
# // Time Complexity : O(n k log n)
# // Space Complexity : O(length of list)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : Followed the solution from class
# // Your code here along with comments explaining your approach

class Solution:
    def groupAnagrams(self, strs):
        #edge case or base case
        if len(strs) == None:
            return []
        #dict as a hasmap to store the sorted key and then macthgin anagrams
        hashmap = dict()
        #iterating over the given list
        for x in strs:
            y = list(x)
            #sorting it to make it a key refernece for other anagrams to match it 
            y.sort()
            key = ''.join(y)
            
            if key in hashmap:
                hashmap[key].append(x)
            else:
                l = list()
                l.append(x)
                hashmap[key] = l
        return hashmap.values()                 

        
