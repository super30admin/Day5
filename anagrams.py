class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        
        
        buffer = 97
        ele_dict ={}
        for ele in strs:
            
            ele_key = [0]*26
            for char in ele:
                ind = ord(char)-buffer
               
                ele_key[ind] += 1 
            ele_key = tuple(ele_key)  
            
            if ele_key in ele_dict.keys():
                ele_dict[ele_key] = ele_dict[ele_key] + [ele]
            else:
                ele_dict[ele_key]= [ele]
            
        return ele_dict.values()

# temp = ["eat","tea","tan","ate","nat","bat"]
# new = Solution()
# new.groupAnagrams(temp)