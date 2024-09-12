# Time Complexity: O(m*n) where m is the average length of each string and n is the number of strings in a given array.
# Space Complexity: O(1) since prime array will be constant of 26 prime numbers assigning to each character
#Code:
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        prime_nums = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]
        anagrams_dict = {}
        
        for each_str in strs:
            summ = 1
            for j in each_str:
                summ = summ * prime_nums[ord(j)-ord('a')]
            if summ in anagrams_dict:
                anagrams_dict[summ].append(each_str)
            else:
                anagrams_dict.update({summ:[each_str]})
            
        return anagrams_dict.values()

# Approach: For this problem, it was mentioned that only lower case letters will be allowed so we assign a prime number array to each character. 
#           We then for each string calculate a unique value by multiplying each character. Check if the product is already there in the dictionary, 
#           if yes, we append the current string to the existing string values in the dictionary. 
#           If not, we create a new key: value pair in the dictonary with key being the product and value being the list of strings having same product.