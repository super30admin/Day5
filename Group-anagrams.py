class Solution:
    def primevalue(self,mystr):
        strval=1
        primenums=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101 ]
        
        for char in mystr:
            strval=strval*primenums[ord(char)-ord('a')]
        return strval
            
            
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        anagramdict={}
        for i in strs:
            finalvalue=self.primevalue(i)
            if finalvalue not in anagramdict.keys():
                anagramdict[finalvalue]=[]
                
            anagramdict[finalvalue].append(i)
        print(anagramdict)
        return anagramdict.values()
            
        
    
        
        
        
                
    
        
            
                
                
        
        
