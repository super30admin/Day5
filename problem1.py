
#Time Complexity O (N)
#Space Complexity O (1) coonstant 
class Solution:
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:    
        dict1 = dict()
        for x in strs:
            y = list(x)
            y.sort()
            key = ''.join(y)
            if key in dict1:
                dict1[key].append(x)
            else:
                l = list()
                l.append(x)
                dict1[key] = l
        return dict1.values()                 
                    
                    
                
    
                        
                        
                        
            
        
        
        
