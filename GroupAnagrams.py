# Time complexity: O(nk(log(k))) ; n = no. of strings, k = max length of string in str (klogk - to sort)
# Space complexity: O(n*k)
# Approach: take dictionary, and store sorted string as key, and append the strings in same key's list whose sorted
# value is same as key. Return all values in last.
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic = {} #took a dictionary where we will store sorted string as key and list of all strings that is equal to the sorted string 
        
        for s in strs:
            sortedKey = ''.join(sorted(s))
            if sortedKey not in dic.keys(): # check for the sorted string s in dic
                dic[sortedKey] = [s]
            else:
                dic[sortedKey].append(s)
        
        return dic.values()

# Another approach: Efficient one
# Time complexity: O(n*k) ; n=no. of elem in list ; k=no. of char in each string
# Space complexity: O(n*k)
    # def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    #     dic = {}
        
    #     for s in strs:
    #         # sortedKey = ''.join(sorted(s))
    #         key = self.getPrimeProduct(s)
    #         if key not in dic.keys(): # check for the sorted string s in dic
    #             dic[key] = [s]
    #         else:
    #             dic[key].append(s)
        
    #     return dic.values()
    
    # def getPrimeProduct(self, s):
    #     primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103]
    #     result = 1
    #     for i in range(len(s)):
    #         result = result * primes[ord(s[i]) - ord('a')] #Getting ASCII value and finding difference
    #     return result