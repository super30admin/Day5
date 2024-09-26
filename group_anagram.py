"""
Time complexity: O(NKlogK), where N is the number of words and K is the length of the longest string
Space Complexity: O(N): size of the hashmap. Worst case - if every word has distinct characters
Execution: Successful

No doubts

Explaination:
1. create a hashmap with values as list and sort every word in hashmap and its equivalent is the list
2.add all the values(list) to the resultant list in result
3.return the result

"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = []
        if len(strs) == 0 or strs == None:
            return result

        hashmap = dict()
        for word in strs:
            sorted_word = ''.join(sorted(word))
            if sorted_word not in hashmap.keys():
                hashmap[sorted_word] = []
                hashmap[sorted_word].append(word)
            else:
                hashmap[sorted_word].append(word)
        for item in hashmap.values():
            result.append(item)
        return result


