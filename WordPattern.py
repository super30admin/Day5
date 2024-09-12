# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        mapPattern = {}
        SeTs = set()
        str1 = s.split()
        if len(str1) != len(pattern): return False
        for i in range(len(pattern)):

            if pattern[i] not in mapPattern and str1[i] not in SeTs: 
                mapPattern[pattern[i]] = str1[i] 
                SeTs.add(str1[i] ) 
            elif pattern[i] not in mapPattern and str1[i] in SeTs:  
                return False
            elif pattern[i] in mapPattern and mapPattern[pattern[i]] != str1[i]: 
                return False

           
        return True
            
          
       
            

        

