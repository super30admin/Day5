from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        Hmap=defaultdict(list)
        output=[]
        
        for word in strs:
            char_array=[0]*26
            for char in word:
                char_array[ord(char)-ord('a')]+=1   
            if tuple(char_array) not in Hmap:
                Hmap[tuple(char_array)]=[word]
            else:
                Hmap[tuple(char_array)].append(word)
                
        
        for key,value in Hmap.items():
            output.append(value)
        
        return output

# Time complexity: O(NK)
# Space complexity: O(NK)