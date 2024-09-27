class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        def helper(s):
            
            index = {}
            ans =[]
            
            for i, c in enumerate(s):
                if c not in index:
                    index[c]= i
                ans.append(str(index[c]))
                
            
            return " ".join(ans)
        
            
            
            
        return helper(s) == helper(t)
