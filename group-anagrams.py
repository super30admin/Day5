"""
Runtime Complexity:
O(n klogk) - because we sort 'k' characters for 'k' words and we loop over the entire list and append it to hashmap's list. We do this for 'n' words in the list so the runtime
for this process is O(n). So the overall runtime complexity is O(n klogk)

Space Complexity:
O(k log k)- we sort 'k' characters and store them as key in our hashmap.
Yes, the code worked on leetcode.
The idea behind the algorithm is, I am storing both the sorted and particular word as a tuple and run a loop over them and append it to sorted word which is a key in hashmap.
"""


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        sorted_str =[("".join(sorted(s)),s) for s in strs]
        anagram_map = defaultdict(list)
        print(sorted_str)
        
        for sorted_s, s in sorted_str:
            anagram_map[sorted_s].append(s)
        
        return anagram_map.values()
