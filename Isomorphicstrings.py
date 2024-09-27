class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sdict={}
        tdict={}
        if len(s)!=len(t):
            return False
        
        for chars,chart in zip(s,t):
            if (chars in sdict.keys()) and (sdict[chars]!=chart):
    
                return False
                                                      
            else:
                sdict[chars]=chart
            if (chart in tdict.keys()) and (tdict[chart]!=chars):
                return False
            else:
                tdict[chart]=chars
        return True
               
            
                
             
            
                                                     
        
        
