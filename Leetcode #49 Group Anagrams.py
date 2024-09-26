# n is length of the strs and k is average length of each word of the list.
# Time Complexity: O(nklog(k))
# Space Complexity: O(n)

class Solution:
    def groupAnagrams(strs):
        if len(strs) == 0 or strs is None:
            return []
        
        dict = {}
        for i in range(len(strs)):
            sorted_word = ''.join(sorted(strs[i]))
            if sorted_word not in dict:
                dict[sorted_word] = [strs[i]]
            else:
                dict[sorted_word].append(strs[i])
            
        return dict.values()
