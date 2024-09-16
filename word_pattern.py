class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        string = s.split(' ')
        
        if len(pattern) != len(string):
            print("Inside")
            return False
        
        pmap={}
        smap={}
        
        for i in range(len(pattern)):
            if pattern[i] in pmap:
                if pmap[pattern[i]]!=string[i]:
                    return False
            else:
                pmap[pattern[i]]=string[i]
            
            if string[i] in smap:
                if smap[string[i]]!=pattern[i]:
                    return False
            else:
                smap[string[i]]=pattern[i]
        
        print(smap)
        print(pmap)
        
        return True