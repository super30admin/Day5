#Time Complexity: O(n) where n is the total number of characters in strs
#Space Complexity: O(n) where n is the total number of characters in strs
#Approach: Create a hashmap with key as a list of 26 counts of each alphabet in the word and its value as a list of word having the same key.
#		   Return the values  
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        result_dict = collections.defaultdict(list)
        for word in strs:
            count_list=[0] * 26
            for char in word:
                count_list[ord(char) - ord('a')] += 1
            result_dict[tuple(count_list)].append(word)
        return result_dict.values()