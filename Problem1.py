#Time Complexity: O(Klog N) where k-no of string given in the list, log n for sorting strings of length n
#Space Complexity: O(1) since dictionary is used to store ans
#Approch:Sort the string in the list, If the sorted string is present in dictionary then these words are anagrams
# hence store the word in  values of dictionary and the key will be the sorted common string

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic={}
        for str in strs:
            sorted_str=''.join(sorted(str))

            if sorted_str in dic:
                dic[sorted_str].append(str)
            else:
                dic[sorted_str]=[str]
        return dic.values()
