# time complexity = O (M*nlogN)
# space Complexity = O(n)
# All test cases passed in Leetcode

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}
        
        for word in strs:
            sorted_word = ''.join(sorted(word))
            
            if sorted_word not in hashmap:
                hashmap[sorted_word] = [word]
            else:
                hashmap[sorted_word].append(word)
        result = []
        
        for values in hashmap.values():
            result.append(values)

        return result
    