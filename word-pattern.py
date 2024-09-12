class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dic = {}
        #converting the string into list of words
        words = (s.split(' '))
        # print(words)
        
        #if the length is not similar, return false
        if len(words) != len(pattern):
            return False
        
        
        for i in range(len(words)):
            c = pattern[i]
            w = words[i]
            # print(c)
            # print(w)
            
            #use a delimiter because the case "abc" and "b c a" returns false but should be true
            delimit_c = '#{}'.format(c)
            delimit_w = '${}'.format(w)
            # print(delimit_c)
            # print(delimit_w)
            
            if delimit_c not in dic:
                dic[delimit_c] = i
            
            if delimit_w not in dic:
                dic[delimit_w] = i
            
            if dic[delimit_c] != dic[delimit_w]:
                return False
            
        return True
            

            
            
            
        
        