#Time complexity: O(NKlogK) + O(n) solution - sorting each string in the list
#Space complexity: O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs) == 0:
            return []
        hashMap = {}
      
        for i in range(len(strs)):
            print(i)
            char = "".join(sorted(strs[i]))
            if char in hashMap:
                hashMap[char].append(strs[i])
           
            else:
                hashMap[char] = [strs[i]]  
      
        return hashMap.values()
        
       