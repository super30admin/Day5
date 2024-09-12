# Time complexity : O(n)
# Space complexity: O(n)

# Two solutions - both ran on Leetcode sucessfully

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

    
'''
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = defaultdict(list)
        
        for word in strs:
            count = [0] * 26
            
            for char in word:
                count[ord(char) - ord('a')] += 1
            
            result[tuple(count)].append(word)
        
        return (result.values())
'''

# The approach in the first program is that the string is sorted and a condition is checked if the sorted string is in the hashmap. If it is already present then the current
# string is appended and if not present then a key value pair of sorted string the the current string is created. result list of strings is created and returned

# The approach in the second program is that a list containing 26 elements with 0 as values is created. Entire word is checked and the count of the chracter occuring is updates.
# Based in the counts obtained the anagrams are appended in the result list.
