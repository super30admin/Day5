class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        mylist=s.split()
        patdict={}
        sdict={}
        if len(pattern)!=len(mylist): #If len are not equal return false
            return False
        for char,word in zip(pattern,mylist): #Iterating through the pattern and mylist
            """
            if element is present it will check if its mapped to correct value
            else: if element is not present it will map the key in pattern to word in mylist
            """
            if (char in patdict.keys()) and (patdict[char]!=word):
                return False
            else:
                patdict[char]=word
            if (word in sdict.keys()) and (sdict[word]!=char):
                return False
            else:
                sdict[word]=char
        return True
            
            
            
        
        
