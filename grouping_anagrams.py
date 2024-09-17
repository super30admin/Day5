# Time Complexity : o(nk) n words, avg length of words k
# Space Complexity : will it be o(n)? as the size of hasmap depends on input
# Did this code successfully run on Leetcode : Yes

#Approach 1: using prime numbers to map alphabets as their multiplication is unique, to extract anagrams
def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    map_s = {}
    def primeprod(s):
        prime_nos = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        prod = 1
        for i in range(len(s)):
            #print(prime_nos[ord(s[i]) - ord('a')])
            prod = prod*prime_nos[ord(s[i]) - ord('a')]
            # print(prod)
        return prod
        
    for i in range(len(strs)):
        s = strs[i]
        prod = primeprod(s)
        if prod not in map_s:
            map_s[prod] = []
        map_s[prod].append(s)
    return map_s.values()  

#Approach 2: sorting every element and maping it to extract anagrams
# Time Complexity: o(nklogk), n words, avg length of word k, sorting the word with length k = klogk
# Space Complexity: will it be o(n)? as the size of hasmap depends on input
def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    map_s = {} 
    
    for i in range(len(strs)):
        s = strs[i]
        new_s = sorted(s)
        sorted_s = "".join(new_s)
        if sorted_s not in map_s:
            map_s[sorted_s] = []
        map_s[sorted_s].append(s)
    
    return map_s.values()    
            