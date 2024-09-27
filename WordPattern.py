class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        '''
        Similar to Isomorphic String
        Bijection
        Here we are mapping every letter in pattern to the list which contains words to in string s and vice versa. We have made list of space separated words from string s and mapping word to letter in pattern and vice versa.
        
        Time Complexity - O(N)
        Space Complexity - O(N) for the list of words formed from string s
        '''
        
        #base case
        if pattern == None or s==None:
            return False
        # Splitting space separated words from string s
        slist = s.split()
        
        ##If length of list of words formed and length of pattern not same -- return False
        if len(pattern)!=len(slist):
            return False
        
        pmap={} #pattern t word mapping
        smap={} #word to pattern mapping
        
        for i in range(len(pattern)):
            
            if pattern[i] in pmap:
                if pmap[pattern[i]]!=slist[i]:
                    return False
            else: # Mapping letter in pattern to corresponding word in word in slist
                pmap[pattern[i]]=slist[i]
                
            if slist[i] in smap:
                if smap[slist[i]]!=pattern[i]:
                    return False
            else: # Mapping word in slist to corresponding letter in pattern
                smap[slist[i]]=pattern[i]
            
        return True
        
        
        