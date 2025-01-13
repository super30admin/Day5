"""
Time Complexity:
    1. Let (k) be length of 1 word
    2. Let (n) be size of list
    3. Sorting -- 0(k log k)
    0(n k log k) 
    Iterating the list, sorting the word and storing in hash-map

Space Complexity:
    1. Dictionary of set 
    2. O(nk)

We are not considering time complexity RESULT list opration

Approach:
    Create a dictionary where key will be unique word in sorted and value will be LIST of anagrams
    (we have to consider duplicates Example: ["",""])

"""
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        words_map = {}

        for i in range(0,len(strs)):

            word = strs[i]
            sorted_word = ''.join(sorted(word)) # sort the word

            if sorted_word not in words_map:
                words_map[sorted_word] = []
            
            words_map[sorted_word].append(word)
        
        # end of for loop

        result = []

        for sorted_word in words_map:
            word_list = words_map[sorted_word]
            result.append(word_list)
        
        # end of for loop

        return result


