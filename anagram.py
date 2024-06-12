


from collections import defaultdict


class Solution:

    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        """
            given array, create anagram dict.

            use hashfunction
            create dictionary to lookup letters in anagram?

            put sorted word as a key, append word to the dict

            if not in dict, add sorted key and word value

            then return values of list, not the key

            1. take empty dict
            2. loop through given arr
            3. sort every word in array, check if in dict as word as value
            4. if not, take sorted word as key, add word as value
            5. loop through dict and print values


            n = array, k = word length, k words is sorted by char then by 
            insertion to hashmap is logm worst case
            time compexity: O(N MLogM)
            space: O(MN) 

        """
        dic = defaultdict()

        for x in strs:
            # this is a key, convert back the sorted char word to string
            sortedWord = "".join(sorted(x)) 
            if sortedWord not in dic:
                #add to dictionary if sortedword key not in it, word as value
                dic[sortedWord] = [x]
            else: 
                dic[sortedWord].append(x)
        
        #loop dictionary to print
        result = []
        for item in dic.values():
            result.append(item)
        return result
            #if x.sort() in dic:




arr = ["eat","tea","tan","ate","nat","bat"]
obj = Solution()
print(obj.groupAnagrams(arr))