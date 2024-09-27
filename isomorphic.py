# // Time Complexity :O(n) where n is the length of the string
# // Space Complexity :O(1) for both hashmaps
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :yes


# // Your code here along with comments explaining your approach




class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if(len(s)!=len(t)):
            return False
        dict1={}
        dict2={}
        for i in range(len(s)):
            print(i)
            if s[i] not in dict1.keys():
                if t[i] in dict2.keys():
                    return False
                else:
                
                    
                    dict1[s[i]]=t[i]
                    dict2[t[i]]=s[i]
                    
            else:
                # print(dict1[s[i]])
                # print(t[i])
                if dict1[s[i]]!=t[i]:
                    return False
                else:
                    if(dict2[t[i]]!=s[i]):
                        return False
        return True
                        
                        
                        
                
            


        
          
                    
            
            